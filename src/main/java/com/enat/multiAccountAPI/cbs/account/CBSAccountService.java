package com.enat.multiAccountAPI.cbs.account;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
//@Service
public interface CBSAccountService {
    Account getAccountDetail(String accountNo, BigDecimal paymentAmount);

}
