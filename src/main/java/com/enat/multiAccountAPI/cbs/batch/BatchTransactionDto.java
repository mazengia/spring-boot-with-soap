package com.enatbanksc.payment.cbs.batch;

import com.enatbanksc.payment.cbs.DrCr;
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
