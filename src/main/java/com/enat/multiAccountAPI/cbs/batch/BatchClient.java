package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;

import static com.enat.multiAccountAPI.cbs.CBSParameters.*;


@Log4j2
@RequiredArgsConstructor
public class BatchClient extends WebServiceGatewaySupport {
    private final String host;
    private final String makerUser;
    private final String authorizerUser;

    public CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate) {

                var request = new CREATEMJRNLBOOKFSFSREQ();
                var fcubsheaderType = new FCUBSHEADERType();
                fcubsheaderType.setOPERATION(BATCH_OPERATION_NAME);
                fcubsheaderType.setUBSCOMP(UBSCOMPType.FCUBS);
                fcubsheaderType.setUSERID(makerUser);
                fcubsheaderType.setMODULEID(BATCH_MODULE_ID);
                fcubsheaderType.setSOURCE(BATCH_SOURCE_ID);
                fcubsheaderType.setSERVICE(BATCH_SERVICE_NAME);
                fcubsheaderType.setSOURCEOPERATION(BATCH_OPERATION_NAME);
                fcubsheaderType.setBRANCH(batchCreate.getBranchCode());
                fcubsheaderType.setSOURCEUSERID(makerUser);
                request.setFCUBSHEADER(fcubsheaderType);
                var fcubsbody = new CREATEMJRNLBOOKFSFSREQ.FCUBSBODY();
                var multiJrnlBookFullType = new MultiJrnlBookFullType();
                multiJrnlBookFullType.setBRANCHCODE(batchCreate.getBranchCode());
                multiJrnlBookFullType.setCCY(LCY_CURRENCY);
                multiJrnlBookFullType.setTOTALDR(batchCreate.getDebitTotal());
                multiJrnlBookFullType.setTOTALCR(batchCreate.getCreditTotal());

                var detbsBatchMaster = new MultiJrnlBookFullType.DetbsBatchMaster();
                detbsBatchMaster.setDEBIT(batchCreate.getDebitTotal());
                detbsBatchMaster.setCREDIT(batchCreate.getCreditTotal());
                detbsBatchMaster.setCRENTTOTAL(batchCreate.getCreditTotal());
                detbsBatchMaster.setDRENTTOTAL(batchCreate.getDebitTotal());
                multiJrnlBookFullType.setDetbsBatchMaster(detbsBatchMaster);
                for (BatchTransaction txn : batchCreate.getTransactions()) {
                    multiJrnlBookFullType.getDetbsJrnlTxnDetail().add(transactionDetail(txn));
                }
                return createBatchMaster(batchCreate.getCreditTotal(), request, fcubsbody, multiJrnlBookFullType);

    }

    private CREATEMJRNLBOOKFSFSRES createBatchMaster(BigDecimal creditAmount, CREATEMJRNLBOOKFSFSREQ request, CREATEMJRNLBOOKFSFSREQ.FCUBSBODY fcubsbody, MultiJrnlBookFullType multiJrnlBookFullType) {
        var devwsBatchMaster = new MultiJrnlBookFullType.DevwsBatchMaster();
        devwsBatchMaster.setBALANCING(BALANCING);
        devwsBatchMaster.setCREDIT(creditAmount);
        devwsBatchMaster.setDEBIT(creditAmount);
        multiJrnlBookFullType.setDevwsBatchMaster(devwsBatchMaster);
        fcubsbody.setDetbsJrnlTxnMasterFull(multiJrnlBookFullType);
        request.setFCUBSBODY(fcubsbody);
        return (CREATEMJRNLBOOKFSFSRES) getWebServiceTemplate()
                .marshalSendAndReceive(host, request);
    }

    private MultiJrnlBookFullType.DetbsJrnlTxnDetail transactionDetail(BatchTransaction transaction) {
        var detbsJrnlTxnDetail = new MultiJrnlBookFullType.DetbsJrnlTxnDetail();
        detbsJrnlTxnDetail.setSERIALNO(transaction.getSerialNo());
        detbsJrnlTxnDetail.setACCOUNT(transaction.getAccountNo());
        detbsJrnlTxnDetail.setDRCR(transaction.getDrCr().getType());
        detbsJrnlTxnDetail.setBRANCHCODE(transaction.getBranchCode());
        detbsJrnlTxnDetail.setAMOUNT(transaction.getLcyAmount());
        detbsJrnlTxnDetail.setCCY(LCY_CURRENCY);
        detbsJrnlTxnDetail.setACORGL(transaction.getAccountOrGL());
        detbsJrnlTxnDetail.setTXNCODE(transaction.getTransactionCode());
        detbsJrnlTxnDetail.setLCYAMOUNT(transaction.getLcyAmount());
        return detbsJrnlTxnDetail;
    }

    /***
     *
     * @param authorizeDTO authorization request batch information
     * @return batch authorization response
     */
    public AUTHORIZEDEBATCHBROWSERFSFSRES authorizeBatch(AuthorizeBatchDto authorizeDTO) {
        var request = new AUTHORIZEDEBATCHBROWSERFSFSREQ();
        var fcubsheaderType = new FCUBSHEADERType();

        fcubsheaderType.setOPERATION(BATCH_OPERATION_NAME_AUTHORIZE);
        fcubsheaderType.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheaderType.setUSERID(authorizerUser);
        fcubsheaderType.setMODULEID(BATCH_MODULE_ID);
        fcubsheaderType.setSOURCE(BATCH_SOURCE_ID);
        fcubsheaderType.setSERVICE(BATCH_SERVICE_NAME);
        fcubsheaderType.setSOURCEOPERATION(BATCH_OPERATION_NAME_AUTHORIZE);
        fcubsheaderType.setBRANCH(authorizeDTO.getBranchCode());
        fcubsheaderType.setSOURCEUSERID(authorizerUser);

        request.setFCUBSHEADER(fcubsheaderType);
        var fcubsbody = new AUTHORIZEDEBATCHBROWSERFSFSREQ.FCUBSBODY();
        var deBatchBrowserFullType = new DEBatchBrowserFullType();
        deBatchBrowserFullType.setDEBATCHNUMBER(authorizeDTO.getBatchNo());
        deBatchBrowserFullType.setDEBRN(authorizeDTO.getMakerBranch());

        fcubsbody.setBatchBrowserFull(deBatchBrowserFullType);
        request.setFCUBSBODY(fcubsbody);
        return (AUTHORIZEDEBATCHBROWSERFSFSRES) getWebServiceTemplate()
                .marshalSendAndReceive(host, request);

    }

    public DELETEDEBATCHBROWSERFSFSRES deleteBatch(DeleteBatchDto deleteBatchDto) {
        var request = new DELETEDEBATCHBROWSERFSFSREQ();
        var fcubsheaderType = new FCUBSHEADERType();

        fcubsheaderType.setOPERATION(BATCH_OPERATION_NAME_AUTHORIZE);
        fcubsheaderType.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheaderType.setUSERID(authorizerUser);
        fcubsheaderType.setMODULEID(BATCH_MODULE_ID);
        fcubsheaderType.setSOURCE(BATCH_SOURCE_ID);
        fcubsheaderType.setSERVICE(BATCH_SERVICE_NAME);
        fcubsheaderType.setSOURCEOPERATION(BATCH_OPERATION_NAME_AUTHORIZE);
        fcubsheaderType.setBRANCH(deleteBatchDto.getMakerBranch());
        fcubsheaderType.setSOURCEUSERID(authorizerUser);

        request.setFCUBSHEADER(fcubsheaderType);
        var fcubsbody = new DELETEDEBATCHBROWSERFSFSREQ.FCUBSBODY();
        var deBatchBrowserFullType = new DEBatchBrowserFullType();
        deBatchBrowserFullType.setDEBATCHNUMBER(deleteBatchDto.getBatchNo());
        deBatchBrowserFullType.setDEBRN(deleteBatchDto.getMakerBranch());

        fcubsbody.setBatchBrowserFull(deBatchBrowserFullType);
        request.setFCUBSBODY(fcubsbody);
        return (DELETEDEBATCHBROWSERFSFSRES) getWebServiceTemplate()
                .marshalSendAndReceive(host, request);
    }


}