package com.enatbanksc.payment.cbs.batch;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorizeBatchDto {
    private String makerBranch;
    private String batchNo;
    private String branchCode;
}
