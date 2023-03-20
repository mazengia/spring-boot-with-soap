package com.enatbanksc.payment.cbs.batch;

import com.enatbanksc.batch.wsdl.AUTHORIZEDEBATCHBROWSERFSFSRES;
import com.enatbanksc.batch.wsdl.CREATEMJRNLBOOKFSFSRES;
import com.enatbanksc.batch.wsdl.DELETEDEBATCHBROWSERFSFSRES;

public interface BatchService {
//    CREATEMJRNLBOOKFSFSRES createBatch(CreateBatchDto createBatchDto);

    CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate);

    AUTHORIZEDEBATCHBROWSERFSFSRES authorizeBatch(AuthorizeBatchDto authorizeBatchDto);

    DELETEDEBATCHBROWSERFSFSRES deleteBatch(DeleteBatchDto deleteBatchDto);
}
