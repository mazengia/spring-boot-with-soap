package com.enat.multiAccountAPI.local.accountType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    Page<AccountType> findAllByDeletedIsFalseOrderByCreatedAtDesc(Pageable pageable);
}
