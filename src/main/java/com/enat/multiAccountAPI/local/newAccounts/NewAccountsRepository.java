package com.enat.multiAccountAPI.local.newAccounts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface NewAccountsRepository extends JpaRepository<NewAccounts, Long> {
    Page<NewAccounts> findAllByDeletedIsFalseOrderByCreatedAtDesc(Pageable pageable);
}
