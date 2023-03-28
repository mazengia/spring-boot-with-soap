package com.enat.multiAccountAPI.local.creditAccounts;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


public interface CreditsApi {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    CreditsDto createIntervenes(@RequestBody @Valid CreditsDto creditsDtos
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    CreditsDto getIntervene(@PathVariable("id") long id);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteIntervene(@PathVariable("id") long id);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    CreditsDto updateIntervene(@PathVariable("id") long id, @RequestBody @Valid CreditsDto creditsDto
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<PagedModel<CreditsDto>> getIntervenes(@Parameter(description = "pagination object",
            schema = @Schema(implementation = Pageable.class))
                                                         @Valid Pageable pageable,
                                                         PagedResourcesAssembler assembler,
                                                         JwtAuthenticationToken token,
                                                         UriComponentsBuilder uriBuilder,
                                                         final HttpServletResponse response);

    @GetMapping("/credit/{batchId}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<PagedModel<CreditsDto>> getCreditByBatchId(@Parameter(description = "pagination object",
            schema = @Schema(implementation = Pageable.class))
                                                              @Valid Pageable pageable,
                                                              @PathVariable("batchId") long batchId,
                                                              PagedResourcesAssembler assembler,
                                                              UriComponentsBuilder uriBuilder,
                                                              final HttpServletResponse response);

}
