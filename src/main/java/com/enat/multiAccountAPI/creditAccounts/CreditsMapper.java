package com.enat.multiAccountAPI.creditAccounts;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreditsMapper {
    Credits toIntervene(CreditsDto creditsDto);

    CreditsDto toInterveneDto(Credits credits);
}
