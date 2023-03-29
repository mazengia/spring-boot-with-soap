package com.enat.multiAccountAPI.creditAccounts;

import com.enat.multiAccountAPI.cbs.batch.BatchCreate;
import com.enat.multiAccountAPI.cbs.batch.BatchTransaction;
import com.enat.multiAccountAPI.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.config.util.Auditable;
import lombok.Data;
@Data
public class CreditsDto extends Auditable {
    private Long id;
    private BatchTransaction transactions;
    private BatchCreate batchCreate;
    private Employee maintainer;
}
