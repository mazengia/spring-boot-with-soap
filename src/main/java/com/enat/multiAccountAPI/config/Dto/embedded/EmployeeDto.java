package com.enat.multiAccountAPI.config.Dto.embedded;

import com.enat.multiAccountAPI.config.Dto.Branch;
import lombok.Data;


@Data
public class EmployeeDto {
    private String employeeId;
    private String fullName;
    private String email;
    private Branch branch;
}