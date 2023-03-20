package com.enatbanksc.payment.cbs.batch;

import com.enatbanksc.payment.cbs.DrCr;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BatchTransaction {
    private BigDecimal serialNo;
    private BigDecimal lcyAmount;
    private String branchCode;
    private String accountNo;
    private String transactionCode;
    private String accountOrGL;
    private String remark;
    private DrCr drCr;


    public void setAccountOrGL(String accountOrGL) {
        this.accountOrGL = this.getAccountNo().length() == 7 ? "G" : "A";
    }
}
