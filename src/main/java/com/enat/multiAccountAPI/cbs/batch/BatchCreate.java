package com.enat.multiAccountAPI.cbs.batch;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class BatchCreate {
    private BigDecimal debitTotal;
    private BigDecimal creditTotal;
    private String branchCode;
    private List<BatchTransaction> transactions;
    private String costCenter;
}
