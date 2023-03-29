package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.DrCr;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class BatchDto   {
    private Long id;
    private BigDecimal debitTotal;
    private BigDecimal creditTotal;
    private BigDecimal debit;
    private BigDecimal credit;
    private String costCenter;
    private List<BatchTransaction> transactions;
    private BigDecimal serialNo;
    private BigDecimal lcyAmount;
    private String branchCode;
    private String accountNo;
    private String transactionCode;
    private String accountOrGL;
    private String remark;
    private DrCr drCr;
}
