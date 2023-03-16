package com.enat.multiAccountAPI.local.newAccounts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public interface NewAccountsService {
    NewAccounts createNewAccounts(
            NewAccounts intervenes
            , JwtAuthenticationToken token
    );
    NewAccounts getNewAccountsById(long id);
    NewAccounts updateNewAccounts(long id, NewAccounts newAccounts
            , JwtAuthenticationToken token
    ) throws IllegalAccessException;
    Page<NewAccounts> getAllNewAccounts(Pageable pageable
            , JwtAuthenticationToken token
    );
    void deleteNewAccountsById(long id);

}
