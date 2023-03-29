package com.enat.multiAccountAPI.creditAccounts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface CreditsRepository extends JpaRepository<Credits, Long> {
    Page<Credits> findAllByDeletedIsFalseOrderByCreatedAtDesc(Pageable pageable);
    Page<Credits> findAllByBatchCreateIdOrderByCreatedAtDesc( long batchId,Pageable pageable);
}
