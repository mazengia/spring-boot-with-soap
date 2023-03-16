package com.enat.multiAccountAPI.cbs.account;

import com.enat.multiAccountAPI.local.config.validation.AccountNumber;
import lombok.Data;

@Data
public class AccountInfo {
    private boolean byCash;
    @AccountNumber(message = "Account number shouldn't be blank if the payment is not by cash")
    private String accountNo;
}
