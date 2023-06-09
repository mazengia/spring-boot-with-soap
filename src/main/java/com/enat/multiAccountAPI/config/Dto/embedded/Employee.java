package com.enat.multiAccountAPI.config.Dto.embedded;

import com.enat.multiAccountAPI.config.Dto.Branch;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeId;
    private String email;
    private String fullName;
    @Embedded()
    @AttributeOverrides({
            @AttributeOverride(name = "id", column = @Column(name = "branch_id"))
            , @AttributeOverride(name = "code", column = @Column(name = "branch_code"))
            , @AttributeOverride(name = "name", column = @Column(name = "branch_name"))})
    private Branch branch;
}