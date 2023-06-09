package com.enat.multiAccountAPI.creditAccounts;


import com.enat.multiAccountAPI.cbs.batch.BatchCreate;
import com.enat.multiAccountAPI.cbs.batch.BatchTransaction;
import com.enat.multiAccountAPI.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.config.util.Auditable;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "credits")
@Data
@Where(clause = "deleted=false")
@SQLDelete(sql = "UPDATE credits SET deleted = 'true' WHERE id=? and version=?")
public class Credits extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "batchId")
    private BatchCreate batchCreate;
    @Embedded
    private  BatchTransaction transactions;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "employeeId", column = @Column(name = "maintainer_employee_id")),
            @AttributeOverride(name = "fullName", column = @Column(name = "maintainer_employee_fullName")),
            @AttributeOverride(name = "branch.code", column = @Column(name = "maintainer_branch_code")),
            @AttributeOverride(name = "branch.name", column = @Column(name = "maintainer_branch_name"))
    })
    private Employee maintainer;

}
