package com.enat.multiAccountAPI.local.creditAccounts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public interface CreditsService {
    Credits createNewAccounts(
            Credits intervenes
            , JwtAuthenticationToken token
    );
    Credits getNewAccountsById(long id);
    Credits updateNewAccounts(long id, Credits credits
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;
    Page<Credits> getAllNewAccounts(Pageable pageable
            , JwtAuthenticationToken token
    );
    void deleteNewAccountsById(long id);

}
