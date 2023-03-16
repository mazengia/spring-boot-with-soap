package com.enat.multiAccountAPI.local.accountType;

import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.local.config.util.Auditable;
import lombok.Data;

@Data
public class AccountTypeDto extends Auditable {
    private Long id;
    private String type;
    private AccountType accountType ;
    private Employee maintainer;
}
