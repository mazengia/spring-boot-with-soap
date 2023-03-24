package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.DrCr;
import com.enat.multiAccountAPI.cbs.account.CBSAccountServiceImp;
import com.enat.multiAccountAPI.local.config.exception.CBSError;
import com.enat.multiAccountAPI.local.config.exception.CBSException;
import com.enat.multiAccountAPI.local.creditAccounts.Credits;
import com.enat.multiAccountAPI.local.creditAccounts.CreditsServiceImpl;
import com.enat.multiAccountAPI.wsdl.batch.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Embedded;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
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
        if (creditTotal != debitTotal || !Objects.equals(batchCreate.getDebit(), batchCreate.getCredit()) || !Objects.equals(batchCreate.getDebitTotal(), batchCreate.getCreditTotal())) {

            throw new CBSException("Failed to create batch. debit amount should be equal to credit amount", new ArrayList<>());
        } else {
            var resp = batchClient.createBatch(batchCreate);
            checkCBSError(resp);
            Credits credits = new Credits();
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
                    batchCreates.setAccountOrGL(batchTransaction.getAccountOrGL());
                    batchCreates.setRemark(batchTransaction.getRemark());
                    batchCreates.setDrCr(batchTransaction.getDrCr());


                    batchCreates= batchRepository.save(batchCreates);
                }
            }
            for (BatchTransaction batchTransaction : batchCreate.getTransactions()) {
                if (!Objects.equals(batchTransaction.getDrCr().getType(), "D")) {
                    credits.setTransactions(batchTransaction);
                    credits.setBatchCreate(batchCreates);
                    creditsService.createNewAccounts(credits, token);
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
