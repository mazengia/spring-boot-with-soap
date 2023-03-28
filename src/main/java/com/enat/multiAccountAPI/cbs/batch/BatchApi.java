package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

public interface BatchApi {
    @PostMapping ()
    CREATEMJRNLBOOKFSFSRES getAccountDetail(@RequestBody @Valid BatchCreate batchTransactionDto,JwtAuthenticationToken token);

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<PagedModel<BatchDto>> getDebits(@Parameter(description = "pagination object",
            schema = @Schema(implementation = Pageable.class))
                                                         @Valid Pageable pageable,
                                                         PagedResourcesAssembler assembler,
                                                         UriComponentsBuilder uriBuilder,
                                                         final HttpServletResponse response);

}
