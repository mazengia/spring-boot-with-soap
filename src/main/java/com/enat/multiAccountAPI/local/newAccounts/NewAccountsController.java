package com.enat.multiAccountAPI.local.newAccounts;

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
@RequestMapping("/api/v1/new-account")
@RequiredArgsConstructor
public class NewAccountsController implements NewAccountsApi {
    private final NewAccountsService newAccountsService;
    private final NewAccountsMapper newAccountsMapper;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public NewAccountsDto createIntervenes(
            NewAccountsDto newAccountsDtos
            , JwtAuthenticationToken token
    )
            throws IllegalAccessException {
        return newAccountsMapper.toInterveneDto(
                newAccountsService.createNewAccounts(
                        newAccountsMapper.toIntervene(newAccountsDtos)
                        , token
                ));
    }

    @Override
    public NewAccountsDto getIntervene(long id) {
        return newAccountsMapper.toInterveneDto(newAccountsService.getNewAccountsById(id));
    }

    @Override
    public void deleteIntervene(long id) {
        newAccountsService.deleteNewAccountsById(id);
    }

    @Override
    public NewAccountsDto updateIntervene(long id, NewAccountsDto newAccountsDto
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        return newAccountsMapper.toInterveneDto(newAccountsService.updateNewAccounts(id, newAccountsMapper.toIntervene(newAccountsDto)
                , token
        ));
    }

    @Override
    public ResponseEntity<PagedModel<NewAccountsDto>> getIntervenes(Pageable pageable, PagedResourcesAssembler assembler
            , JwtAuthenticationToken token
            , UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                NewAccountsDto.class, uriBuilder, response, pageable.getPageNumber(), newAccountsService.getAllNewAccounts(pageable
                , token
        ).getTotalPages(), pageable.getPageSize()));
        return new ResponseEntity<PagedModel<NewAccountsDto>>(assembler.toModel(newAccountsService.getAllNewAccounts(pageable
                , token
        ).map(newAccountsMapper::toInterveneDto)), HttpStatus.OK);
    }
}
