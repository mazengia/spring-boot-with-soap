package com.enat.multiAccountAPI.cbs.batch;


import com.enat.multiAccountAPI.wsdl.batch.*;

public interface BatchService {
//    CREATEMJRNLBOOKFSFSRES createBatch(CreateBatchDto createBatchDto);

    CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate);

    AUTHORIZEDEBATCHBROWSERFSFSRES authorizeBatch(AuthorizeBatchDto authorizeBatchDto);

    DELETEDEBATCHBROWSERFSFSRES deleteBatch(DeleteBatchDto deleteBatchDto);
}
