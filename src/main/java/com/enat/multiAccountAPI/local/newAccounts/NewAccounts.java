package com.enat.multiAccountAPI.local.newAccounts;


import com.enat.multiAccountAPI.local.accountType.AccountType;
import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.local.config.util.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "new_accounts")
@Data
@Where(clause = "deleted=false")
@SQLDelete(sql = "UPDATE new_accounts SET deleted = 'true' WHERE id=? and version=?")
public class NewAccounts extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    @ManyToOne(fetch = FetchType.EAGER  )
    @JoinColumn(name = "accountTypeId",nullable = false)
    @JsonIgnoreProperties(value={"new_accounts"} )
    private AccountType accountType ;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "employeeId", column = @Column(name = "maintainer_employee_id")),
            @AttributeOverride(name = "fullName", column = @Column(name = "maintainer_employee_fullName")),
            @AttributeOverride(name = "branch.code", column = @Column(name = "maintainer_branch_code")),
            @AttributeOverride(name = "branch.name", column = @Column(name = "maintainer_branch_name"))
    })
    private Employee maintainer;

}
