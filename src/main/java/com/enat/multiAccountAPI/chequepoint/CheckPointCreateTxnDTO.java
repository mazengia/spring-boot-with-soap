package com.enatbanksc.payment.chequepoint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckPointCreateTxnDTO {
    private BigDecimal amount;
    private String debitAccount;
    private String debitAccountName;
    private String destinationAccount;
    private String destinationAccountName;
    private String destinationBankSwiftCode;
    private String originatorRef;
    private String remarks;


}
