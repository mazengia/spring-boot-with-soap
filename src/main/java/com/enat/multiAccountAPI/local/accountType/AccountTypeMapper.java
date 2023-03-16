package com.enat.multiAccountAPI.local.accountType;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountTypeMapper {
    AccountType toAccountType(AccountTypeDto newAccountsDto);
    AccountTypeDto toAccountTypeDto(AccountType newAccounts);
}
