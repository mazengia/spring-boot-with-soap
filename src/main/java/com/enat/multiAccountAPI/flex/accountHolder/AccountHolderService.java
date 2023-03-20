package com.enat.multiAccountAPI.flex.accountHolder;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface AccountHolderService {
    Page<AccountHolder> getAccountHolder(String accountNumber, Pageable pageable) throws IllegalAccessException;


}
