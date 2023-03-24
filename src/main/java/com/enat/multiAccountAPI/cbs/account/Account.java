package com.enat.multiAccountAPI.cbs.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class Account {
    private String customerName;
    private BigDecimal balance;
    @NotNull
    private String accountNo;
    @NotNull
    private String branch;
    @NotNull
    private String creditFlag;
}
