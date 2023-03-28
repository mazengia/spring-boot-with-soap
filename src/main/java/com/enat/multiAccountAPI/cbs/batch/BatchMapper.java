package com.enat.multiAccountAPI.cbs.batch;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BatchMapper {
    BatchCreate toBatchCreate(BatchDto batchDto);
    BatchDto toBatchCreateDto(BatchCreate batchCreate);
}
