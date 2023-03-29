package com.enat.multiAccountAPI.cbs.config.validation;

import com.enat.multiAccountAPI.cbs.account.AccountInfo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.isNull;

public class AccountNumberValidator implements ConstraintValidator<AccountNumber, AccountInfo> {

    @Override
    public boolean isValid(AccountInfo accountInfo, ConstraintValidatorContext constraintValidatorContext) {
        if (accountInfo.isByCash()) {
            return true;
        }
        if (!isNull(accountInfo.getAccountNo())) {
           return !accountInfo.getAccountNo().isBlank();
        }
        return false;
    }
}
