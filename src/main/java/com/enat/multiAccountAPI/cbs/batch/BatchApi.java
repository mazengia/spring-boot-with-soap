package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface BtchApi {
    @PostMapping ()
    CREATEMJRNLBOOKFSFSRES getAccountDetail(@RequestBody @Valid BatchCreate batchTransactionDto  );
}
