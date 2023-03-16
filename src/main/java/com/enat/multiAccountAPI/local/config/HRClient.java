package com.enat.multiAccountAPI.local.config;

import com.enat.multiAccountAPI.local.config.Dto.embedded.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "employee-service", url = "${services.hr}")
public interface HRClient {

    @GetMapping("/employees/by-employeeId/{employeeId}")
    EmployeeDto getEmployeeById(@PathVariable("employeeId") String employeeId);

}
