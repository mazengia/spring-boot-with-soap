package com.enat.multiAccountAPI.local.newAccounts;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewAccountsMapper {
    NewAccounts toIntervene(NewAccountsDto newAccountsDto);

    NewAccountsDto toInterveneDto(NewAccounts newAccounts);
}
