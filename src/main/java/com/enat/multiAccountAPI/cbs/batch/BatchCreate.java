package com.enat.multiAccountAPI.cbs.batch;

import com.enat.multiAccountAPI.cbs.DrCr;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "batchCreate")
public class BatchCreate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal debitTotal;
    private BigDecimal creditTotal;
    private BigDecimal debit;
    private BigDecimal credit;
    private String costCenter;
    @Embedded
    private List<BatchTransaction> transactions; private BigDecimal serialNo;
    private BigDecimal lcyAmount;
    private String branchCode;
    private String accountNo;
    private String transactionCode;
    private String accountOrGL;
    private String remark;
    private DrCr drCr;
}
