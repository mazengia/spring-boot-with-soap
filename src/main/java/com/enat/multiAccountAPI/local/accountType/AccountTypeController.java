package com.enat.multiAccountAPI.local.accountType;

import com.enat.multiAccountAPI.local.config.util.PaginatedResultsRetrievedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/account-type")
@RequiredArgsConstructor
public class AccountTypeController implements AccountTypeApi {
    private final AccountTypeService accountTypeService;
    private final AccountTypeMapper accountTypeMapper;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public AccountTypeDto createAccountType(
            AccountTypeDto newAccountsDtos
            , JwtAuthenticationToken token
    )
            throws IllegalAccessException {
        return accountTypeMapper.toAccountTypeDto(
                accountTypeService.createAccountType(
                        accountTypeMapper.toAccountType(newAccountsDtos)
                        , token
                ));
    }

    @Override
    public AccountTypeDto getAccountTypeById(long id) {
        return accountTypeMapper.toAccountTypeDto(accountTypeService.getAccountTypeById(id));
    }

    @Override
    public void deleteAccountType(long id) {
        accountTypeService.deleteAccountTypeById(id);
    }

    @Override
    public AccountTypeDto updateAccountType(long id, AccountTypeDto newAccountsDto
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        return accountTypeMapper.toAccountTypeDto(accountTypeService.updateAccountType(id, accountTypeMapper.toAccountType(newAccountsDto)
                , token
        ));
    }

    @Override
    public ResponseEntity<PagedModel<AccountTypeDto>> getAllAccountType(Pageable pageable, PagedResourcesAssembler assembler
            , JwtAuthenticationToken token
            , UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                AccountTypeDto.class, uriBuilder, response, pageable.getPageNumber(), accountTypeService.getAllAccountType(pageable
                , token
        ).getTotalPages(), pageable.getPageSize()));
        return new ResponseEntity<PagedModel<AccountTypeDto>>(assembler.toModel(accountTypeService.getAllAccountType(pageable
                , token
        ).map(accountTypeMapper::toAccountTypeDto)), HttpStatus.OK);
    }
}
