package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.DrCr;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BatchTransactionDto {
    private String account;
    private BigDecimal amount;
    private String branch;
    private DrCr drCr;
}
