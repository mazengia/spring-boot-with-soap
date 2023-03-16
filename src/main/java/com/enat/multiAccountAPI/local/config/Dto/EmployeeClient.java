package com.enat.multiAccountAPI.local.config.Dto;


import com.enat.multiAccountAPI.local.config.Dto.embedded.EmployeeDto;
import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
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
