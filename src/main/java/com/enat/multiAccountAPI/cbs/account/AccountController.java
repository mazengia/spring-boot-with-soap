package com.enat.multiAccountAPI.cbs.account;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController implements AccountApi {
    private final CBSAccountService accountService;

    @Override
    public Account getAccountDetail(String accountNo ) {
        return accountService.getAccountDetail(accountNo );
    }
}
