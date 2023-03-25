package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface BatchApi {
    @PostMapping ()
    CREATEMJRNLBOOKFSFSRES getAccountDetail(@RequestBody @Valid BatchCreate batchTransactionDto,JwtAuthenticationToken token);
}
