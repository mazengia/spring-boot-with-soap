package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.local.config.exception.CBSError;
import com.enat.multiAccountAPI.local.config.exception.CBSException;
import com.enat.multiAccountAPI.wsdl.batch.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class BatchServiceImp implements BatchService {
    private final BatchClient batchClient;

//    @Deprecated
//    @Override
//    public CREATEMJRNLBOOKFSFSRES createBatch(CreateBatchDto createBatchDto) {
//        var transactionDTO = BatchTransactionDto.builder()
//                .account(createBatchDto.getCreditAccount())
//                .amount(createBatchDto.getAmount())
//                .branch(createBatchDto.getCreditAccountBranch())
//                .drCr(DrCr.CREDIT)
//                .build();
//        var multiCreditBatch = batchClient.createBatch(createBatchDto, List.of(transactionDTO));
//        checkCBSError(multiCreditBatch);
//        return multiCreditBatch;
//    }

    @Override
    public CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate) {
        var resp = batchClient.createBatch(batchCreate);
        checkCBSError(resp);
        return resp;
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
