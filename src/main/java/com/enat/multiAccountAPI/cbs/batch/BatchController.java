package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.local.config.util.PaginatedResultsRetrievedEvent;
import com.enat.multiAccountAPI.wsdl.batch.CREATEMJRNLBOOKFSFSRES;
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
@RequestMapping("/batches")
@RequiredArgsConstructor
public class BatchController implements BatchApi {
    private final ApplicationEventPublisher eventPublisher;
    private final BatchService batchService;
    private final BatchMapper batchMapper;

    @Override
    public CREATEMJRNLBOOKFSFSRES getAccountDetail(BatchCreate batchTransactionDto, JwtAuthenticationToken token) {
        var createmjrnlbookfsfsres = batchService.createBatch(batchTransactionDto, token);
        return createmjrnlbookfsfsres;
    }

    @Override
    public ResponseEntity<PagedModel<BatchDto>> getDebits(Pageable pageable, PagedResourcesAssembler assembler
            , UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        eventPublisher.publishEvent(new PaginatedResultsRetrievedEvent<>(
                BatchDto.class, uriBuilder, response, pageable.getPageNumber(),
                batchService.getAllDebits(pageable
                ).getTotalPages(),
                pageable.getPageSize()));
        return new ResponseEntity<PagedModel<BatchDto>>(assembler.toModel(batchService.getAllDebits(pageable).map(batchMapper::toBatchCreateDto)), HttpStatus.OK);
    }
}
