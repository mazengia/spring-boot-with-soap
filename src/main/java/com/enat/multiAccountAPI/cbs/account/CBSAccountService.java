package com.enat.multiAccountAPI.cbs.account;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
public interface CBSAccountService {
    Account getAccountDetail(String accountNo);

}
