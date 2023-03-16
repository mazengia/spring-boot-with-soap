package com.enat.multiAccountAPI.local.accountType;


import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.local.config.util.Auditable;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "accounttype")
@Data
@Where(clause = "deleted=false")
@SQLDelete(sql = "UPDATE accountType SET deleted = 'true' WHERE id=? and version=?")
public class AccountType extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "type may not be Empty!")
    private String type;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "employeeId", column = @Column(name = "maintainer_employee_id")),
            @AttributeOverride(name = "fullName", column = @Column(name = "maintainer_employee_fullName")),
            @AttributeOverride(name = "branch.code", column = @Column(name = "maintainer_branch_code")),
            @AttributeOverride(name = "branch.name", column = @Column(name = "maintainer_branch_name"))
    })
    private Employee maintainer;

}
