//package com.enat.multiAccountAPI.flex.accountHolder;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Data
//@Entity(name = "SWTM_CARD_DETAILS")
//@NamedNativeQuery(name = "AccountHolder.findOneCardHolder", query = "select SWTM_CARD_DETAILS.ATM_CARD_NO,fcc_acc_no , sttm_cust_personal.mobile_number as mobile ,  sttm_cust_personal.P_address1 as adress1 , sttm_cust_personal.P_address2 as adress2,  sttm_cust_personal.P_address3 as adress3, STTM_CUSTOMER.customer_name1 AS CUSTOMERNAME,STTM_CUSTOMER.CUSTOMER_NO AS CUSTNUMBER from SWTM_CARD_DETAILS JOIN sttm_cust_account ON sttm_cust_account.cust_ac_no=  SWTM_CARD_DETAILS.FCC_ACC_NO JOIN STTM_CUSTOMER ON STTM_CUSTOMER.CUSTOMER_NO=sttm_cust_account.cust_no JOIN sttm_cust_personal  ON sttm_cust_personal.CUSTOMER_NO=  sttm_cust_account.cust_no where  SWTM_CARD_DETAILS.fcc_acc_no  = ?", resultSetMapping = "AccountHolder")
//@SqlResultSetMapping(name = "AccountHolder",
//        classes = @ConstructorResult(targetClass = AccountHolder.class,
//                columns = {
//                        @ColumnResult(name = "CUSTNUMBER", type = String.class),
//                        @ColumnResult(name = "ATM_CARD_NO", type = String.class),
//                        @ColumnResult(name = "FCC_ACC_NO", type = String.class),
//                        @ColumnResult(name = "CUSTOMERNAME", type = String.class),
//                        @ColumnResult(name="adress1", type = String.class),
//                        @ColumnResult(name="adress2", type = String.class),
//                        @ColumnResult(name="adress3", type = String.class),
//                        @ColumnResult(name="mobile", type = String.class)
//                }))
//@NoArgsConstructor
//@AllArgsConstructor
//public class AccountHolder implements Serializable {
//    private String CUSTNUMBER;
//    private@Id String ATM_CARD_NO;
//    private String FCC_ACC_NO;
//    private String CUSTOMERNAME;
//    private String adress1;
//    private String adress2;
//    private String adress3;
//    private String mobile;
//}
//
