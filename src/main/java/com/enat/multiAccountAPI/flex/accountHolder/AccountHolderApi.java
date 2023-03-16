//package com.enat.multiAccountAPI.flex.accountHolder;
//
//
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.media.Schema;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PagedResourcesAssembler;
//import org.springframework.hateoas.PagedModel;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.Valid;
//
//public interface AccountHolderApi {
//    @GetMapping("/{accountNumber}")
//    @ResponseStatus(HttpStatus.OK)
//    ResponseEntity<PagedModel<AccountHolderDto>> getComments(@Parameter(description = "pagination object",
//            schema = @Schema(implementation = Pageable.class)) @Valid Pageable pageable
//            , PagedResourcesAssembler assembler,
//                                                             @PathVariable("accountNumber") String accountNumber
//            , UriComponentsBuilder uriBuilder
//            , final HttpServletResponse response) throws IllegalAccessException;
//}