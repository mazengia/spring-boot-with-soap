package com.enat.multiAccountAPI.cbs.batch;


import com.enat.multiAccountAPI.wsdl.batch.AUTHORIZEDEBATCHBROWSERFSFSRES;
import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import com.enat.multiAccountAPI.wsdl.batch.DELETEDEBATCHBROWSERFSFSRES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public interface BatchService {
    CREATEMJRNLBOOKFSFSRES createBatch(BatchCreate batchCreate,JwtAuthenticationToken token);

    AUTHORIZEDEBATCHBROWSERFSFSRES authorizeBatch(AuthorizeBatchDto authorizeBatchDto);
    DELETEDEBATCHBROWSERFSFSRES deleteBatch(DeleteBatchDto deleteBatchDto);
    Page<BatchCreate> getAllDebits(Pageable pageable  );
}
