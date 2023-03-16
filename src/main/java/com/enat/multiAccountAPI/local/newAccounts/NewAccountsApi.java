package com.enat.multiAccountAPI.local.newAccounts;


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


public interface NewAccountsApi {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    NewAccountsDto createIntervenes(@RequestBody @Valid NewAccountsDto newAccountsDtos
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    NewAccountsDto getIntervene(@PathVariable("id") long id);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteIntervene(@PathVariable("id") long id);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    NewAccountsDto updateIntervene(@PathVariable("id") long id, @RequestBody @Valid NewAccountsDto newAccountsDto
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<PagedModel<NewAccountsDto>> getIntervenes(@Parameter(description = "pagination object",
            schema = @Schema(implementation = Pageable.class))
                                                               @Valid Pageable pageable,
                                                             PagedResourcesAssembler assembler,
                                                             JwtAuthenticationToken token,
                                                             UriComponentsBuilder uriBuilder,
                                                             final HttpServletResponse response);
}
