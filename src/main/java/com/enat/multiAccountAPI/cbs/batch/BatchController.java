package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/btches")
@RequiredArgsConstructor
public class BtchController implements BtchApi {
    private final BatchService batchService;

    @Override
    public CREATEMJRNLBOOKFSFSRES getAccountDetail(BatchCreate batchTransactionDto) {
        return batchService.createBatch(batchTransactionDto);
    }

}
