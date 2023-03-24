package com.enat.multiAccountAPI.flex.accountHolder;

 import com.enat.multiAccountAPI.local.creditAccounts.CreditsDto;
 import com.enat.multiAccountAPI.local.config.util.PaginatedResultsRetrievedEvent;
 import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/account-holder")
@RequiredArgsConstructor
public class AccountHolderController implements AccountHolderApi {
    private final AccountHolderMapper accountHolderMapper;
    private final AccountHolderService accountHolderService;
    private final ApplicationEventPublisher eventPublisher;
    @Override
    public ResponseEntity<PagedModel<AccountHolderDto>> getComments(Pageable pageable, PagedResourcesAssembler assembler, String accountNumber, UriComponentsBuilder uriBuilder, HttpServletResponse response) throws IllegalAccessException {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                CreditsDto.class, uriBuilder, response, pageable.getPageNumber(), accountHolderService.getAccountHolder(accountNumber, pageable).getTotalPages(), pageable.getPageSize()));
        return new ResponseEntity<PagedModel<AccountHolderDto>>(assembler.toModel(accountHolderService.getAccountHolder(accountNumber, pageable).map(accountHolderMapper::toAccountHolderDto)), HttpStatus.OK);
    }

}
