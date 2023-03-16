package com.enat.multiAccountAPI.local.newAccounts;

import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.local.config.util.Auditable;
import lombok.Data;

@Data
public class NewAccountsDto extends Auditable {
    private Long id;
    private String accountNumber;
    private Employee maintainer;
}
