package com.enat.multiAccountAPI.local.creditAccounts;

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
public class CreditsController implements CreditsApi {
    private final CreditsService creditsService;
    private final CreditsMapper creditsMapper;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public CreditsDto createIntervenes(
            CreditsDto creditsDtos
            , JwtAuthenticationToken token
    )
            throws IllegalAccessException {
        return creditsMapper.toInterveneDto(
                creditsService.createNewAccounts(
                        creditsMapper.toIntervene(creditsDtos)
                        , token
                ));
    }

    @Override
    public CreditsDto getIntervene(long id) {
        return creditsMapper.toInterveneDto(creditsService.getNewAccountsById(id));
    }

    @Override
    public void deleteIntervene(long id) {
        creditsService.deleteNewAccountsById(id);
    }

    @Override
    public CreditsDto updateIntervene(long id, CreditsDto creditsDto
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        return creditsMapper.toInterveneDto(creditsService.updateNewAccounts(id, creditsMapper.toIntervene(creditsDto)
                , token
        ));
    }

    @Override
    public ResponseEntity<PagedModel<CreditsDto>> getIntervenes(Pageable pageable, PagedResourcesAssembler assembler
            , JwtAuthenticationToken token
            , UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                CreditsDto.class, uriBuilder, response, pageable.getPageNumber(), creditsService.getAllNewAccounts(pageable
                , token
        ).getTotalPages(), pageable.getPageSize()));
        return new ResponseEntity<PagedModel<CreditsDto>>(assembler.toModel(creditsService.getAllNewAccounts(pageable
                , token
        ).map(creditsMapper::toInterveneDto)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PagedModel<CreditsDto>> getCreditByBatchId(Pageable pageable, long batchId, PagedResourcesAssembler assembler,   UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                CreditsDto.class, uriBuilder, response, pageable.getPageNumber(),
                creditsService.getCreditByBatchId(batchId,pageable).getTotalPages(), pageable.getPageSize()));
        return new ResponseEntity<PagedModel<CreditsDto>>(
                assembler.toModel(creditsService.getCreditByBatchId(batchId,pageable).map(creditsMapper::toInterveneDto)), HttpStatus.OK);
    }
}
