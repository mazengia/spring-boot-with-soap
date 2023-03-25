package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.DrCr;
import lombok.*;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Getter
@Setter
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BatchTransaction {
    private BigDecimal serialNo;
    private BigDecimal lcyAmount;
    private String branchCode;
    private String accountNo;
    private String transactionCode;
    private String accountOrGL;
    private String remark;
    private DrCr drCr;
}
