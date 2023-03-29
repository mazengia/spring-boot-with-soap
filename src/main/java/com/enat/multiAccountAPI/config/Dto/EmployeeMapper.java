package com.enat.multiAccountAPI.config.Dto;

import com.enat.multiAccountAPI.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.config.Dto.embedded.EmployeeDto;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}