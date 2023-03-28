package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.account.CBSAccountServiceImp;
import com.enat.multiAccountAPI.local.config.exception.CBSError;
import com.enat.multiAccountAPI.local.config.exception.CBSException;
import com.enat.multiAccountAPI.local.creditAccounts.Credits;
import com.enat.multiAccountAPI.local.creditAccounts.CreditsServiceImpl;
import com.enat.multiAccountAPI.wsdl.batch.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Log4j2
public class BatchServiceImp implements BatchService {
    private final BatchClient batchClient;
    private final CBSAccountServiceImp cbsAccountServiceImp;
    private final BatchRepository batchRepository;
    private final CreditsServiceImpl creditsService;

    @Override
    public CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate, JwtAuthenticationToken token) {
        int creditTotal = 0;
        int debitTotal = 0;
        BatchCreate batchCreates=new BatchCreate();
        BatchCreate batchCreates2=new BatchCreate();
        for (BatchTransaction batchTransaction : batchCreate.getTransactions()) {
            if (Objects.equals(batchTransaction.getDrCr().getType(), "D")) {
                debitTotal = batchTransaction.getLcyAmount().intValue() + debitTotal;
            }
            if (Objects.equals(batchTransaction.getDrCr().getType(), "C")) {
                creditTotal = creditTotal + batchTransaction.getLcyAmount().intValue();
            }
            var accountDetail = cbsAccountServiceImp.getAccountDetail(batchTransaction.getAccountNo());
            if (accountDetail.getBalance().intValue() < batchTransaction.getLcyAmount().intValue()) {
                throw new CBSException("You don't have sufficient balance", new ArrayList<>());
            }
        }
        if (creditTotal != debitTotal) {

            throw new CBSException("Failed to create batch. debit amount should be equal to credit amount", new ArrayList<>());
        } else {
            var resp = batchClient.createBatch(batchCreate);
            checkCBSError(resp);
            if (resp.getFCUBSBODY()
                    .getFCUBSWARNINGRESP()
                    .get(0).getWARNING()
                    .get(0).getWDESC().equals("Successfully Saved and Authorized")) {
                for (BatchTransaction batchTransaction : batchCreate.getTransactions()) {
                    if (Objects.equals(batchTransaction.getDrCr().getType(), "D")) {
                        batchCreates.setCostCenter(batchCreate.getCostCenter());
                        batchCreates.setDebit(batchCreate.getDebit());
                        batchCreates.setCredit(batchCreate.getCredit());
                        batchCreates.setDebitTotal(batchCreate.getDebitTotal());
                        batchCreates.setCreditTotal(batchCreate.getCreditTotal());
                        batchCreates.setBranchCode(batchCreate.getBranchCode());
                        batchCreates.setSerialNo(batchTransaction.getSerialNo());
                        batchCreates.setAccountNo(batchTransaction.getAccountNo());
                        batchCreates.setLcyAmount(batchTransaction.getLcyAmount());
                        batchCreates.setBranchCode(batchTransaction.getBranchCode());
                        batchCreates.setTransactionCode(batchTransaction.getTransactionCode());
                        batchCreates.setDrCr(batchTransaction.getDrCr());
                        batchCreates2 = batchRepository.save(batchCreates);
                    }
                }
                if (batchCreates2.getId() != null){
                    for (BatchTransaction batchTransaction : batchCreate.getTransactions()) {
                        Credits credits = new Credits();
                        if (Objects.equals(batchTransaction.getDrCr().getType(), "C")) {
                            System.out.println(batchTransaction.getDrCr().getType());
                            credits.setTransactions(batchTransaction);
                            credits.setBatchCreate(batchCreates2);
                            creditsService.createNewAccounts(credits, token);
                        }
                    }
               }
            }
            return resp;
        }
    }

    @Override
    public AUTHORIZEDEBATCHBROWSERFSFSRES authorizeBatch(AuthorizeBatchDto authorizeBatchDto) {
        var rep = batchClient.authorizeBatch(authorizeBatchDto);
        checkCBSError(rep);
        return rep;
    }

    @Override
    public DELETEDEBATCHBROWSERFSFSRES deleteBatch(DeleteBatchDto deleteBatchDto) {
        var res = batchClient.deleteBatch(deleteBatchDto);
        checkCBSError(res);
        return res;
    }

    @Override
    public Page<BatchCreate> getAllDebits(Pageable pageable) {
        return batchRepository.findAll(pageable);
    }


    private void checkCBSError(CREATEMJRNLBOOKFSFSRES rep) {
        if (!rep.getFCUBSBODY().getFCUBSERRORRESP().isEmpty()) {
            List<CBSError> errors = new ArrayList<>();
            for (ERRORType errorType : rep.getFCUBSBODY().getFCUBSERRORRESP()) {
                for (ERRORDETAILSType errordetailsType : errorType.getERROR()) {
                    log.error("Failed to create.Core banking error {} {}", errordetailsType.getECODE(), errordetailsType.getEDESC());
                    CBSError cbsError = new CBSError(errordetailsType.getECODE(), errordetailsType.getEDESC());
                    errors.add(cbsError);
                }
            }
            throw new CBSException("Failed to create Batch", errors);
        }
    }

    private void checkCBSError(AUTHORIZEDEBATCHBROWSERFSFSRES rep) {
        if (!rep.getFCUBSBODY().getFCUBSERRORRESP().isEmpty()) {
            List<CBSError> errors = new ArrayList<>();
            for (ERRORType errorType : rep.getFCUBSBODY().getFCUBSERRORRESP()) {
                for (ERRORDETAILSType errordetailsType : errorType.getERROR()) {
                    log.error("Failed to authorize.Core banking error {} {}", errordetailsType.getECODE(), errordetailsType.getEDESC());
                    CBSError cbsError = new CBSError(errordetailsType.getECODE(), errordetailsType.getEDESC());
                    errors.add(cbsError);
                }
            }
            throw new CBSException("Failed to authorize batch", errors);
        }
    }

    private void checkCBSError(DELETEDEBATCHBROWSERFSFSRES rep) {
        if (!rep.getFCUBSBODY().getFCUBSERRORRESP().isEmpty()) {
            List<CBSError> errors = new ArrayList<>();
            for (ERRORType errorType : rep.getFCUBSBODY().getFCUBSERRORRESP()) {
                for (ERRORDETAILSType errordetailsType : errorType.getERROR()) {
                    log.error("Failed to delete.Core banking error {} {}", errordetailsType.getECODE(), errordetailsType.getEDESC());
                    CBSError cbsError = new CBSError(errordetailsType.getECODE(), errordetailsType.getEDESC());
                    errors.add(cbsError);
                }
            }
            throw new CBSException("Failed to delete batch", errors);
        }
    }
}
