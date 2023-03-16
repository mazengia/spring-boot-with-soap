package com.enat.multiAccountAPI.local.config.Dto;

import com.enat.multiAccountAPI.local.config.Dto.embedded.EmployeeDto;
import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}