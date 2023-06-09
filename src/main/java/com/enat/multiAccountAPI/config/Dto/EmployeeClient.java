package com.enat.multiAccountAPI.config.Dto;


import com.enat.multiAccountAPI.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.config.Dto.embedded.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "employee-service",url = "${services.hr}")
public interface EmployeeClient {
    @GetMapping("/employees/by-employeeId/{employeeId}")
    EmployeeDto getEmployeeById(@PathVariable("employeeId") String employeeId);
    @GetMapping("/employees/search?search=status:ACTIVE")
    List<Employee> getActiveEmployees();

}
