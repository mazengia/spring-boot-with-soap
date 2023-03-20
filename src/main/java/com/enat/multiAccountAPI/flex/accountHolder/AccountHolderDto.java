package com.enat.multiAccountAPI.flex.accountHolder;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AccountHolderDto {
    private String CUSTNUMBER;
    private@Id String ATM_CARD_NO;
    private String FCC_ACC_NO;
    private String CUSTOMERNAME;
    private String adress1;
    private String adress2;
    private String adress3;
    private String mobile;

}
