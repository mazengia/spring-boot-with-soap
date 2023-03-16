package com.enat.multiAccountAPI.local.accountType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public interface AccountTypeService {
    AccountType createAccountType(AccountType intervenes, JwtAuthenticationToken token);
    AccountType getAccountTypeById(long id);
    AccountType updateAccountType(long id, AccountType newAccounts, JwtAuthenticationToken token) throws IllegalAccessException;
    Page<AccountType> getAllAccountType(Pageable pageable, JwtAuthenticationToken token);
    void deleteAccountTypeById(long id);

}
