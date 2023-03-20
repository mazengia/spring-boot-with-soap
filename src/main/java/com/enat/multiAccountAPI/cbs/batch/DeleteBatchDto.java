package com.enatbanksc.payment.cbs.batch;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteBatchDto {
    private String makerBranch;
    private String batchNo;
    private String branchCode;
}
