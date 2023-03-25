package com.enat.multiAccountAPI.cbs.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountApi {
    @GetMapping("/{accountNo}")
    Account getAccountDetail(@PathVariable("accountNo") String accountNo );
}
