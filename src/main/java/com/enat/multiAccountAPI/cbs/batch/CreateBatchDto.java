package com.enatbanksc.payment.cbs.batch;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Builder
public class CreateBatchDto {
    private BigDecimal amount;
    private String debitAccount;
    @Size(min = 3, max = 3,message = "Account branch code should be exactly 3 digits")
    private String debitAccountBranch;
    private String creditAccount;
    @Size(min = 3, max = 3,message = "Account branch code should be exactly 3 digits")
    private String creditAccountBranch;
    private String makerBranch;
}
