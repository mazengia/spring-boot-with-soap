package com.enat.multiAccountAPI.cbs.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface AccountApi {
    @GetMapping("/{accountNo}")
    Account getAccountDetail(@PathVariable("accountNo") String accountNo, @RequestParam("paymentAmount")BigDecimal payment);
}
