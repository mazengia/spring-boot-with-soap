package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batches")
@RequiredArgsConstructor
public class BatchController implements BatchApi {
    private final BatchService batchService;



    @Override
    public CREATEMJRNLBOOKFSFSRES getAccountDetail(BatchCreate batchTransactionDto,JwtAuthenticationToken token) {
        var createmjrnlbookfsfsres=batchService.createBatch(batchTransactionDto,token);
             return createmjrnlbookfsfsres;
    }

}
