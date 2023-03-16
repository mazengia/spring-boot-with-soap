package com.enat.multiAccountAPI.cbs.account;

import com.enat.multiAccountAPI.local.config.exception.CBSError;
import com.enat.multiAccountAPI.local.config.exception.CBSException;
import com.enat.multiAccountAPI.local.config.exception.InsufficientBalanceException;
import com.enat.multiAccountAPI.wsdl.account.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class CBSAccountServiceImp implements CBSAccountService {

    private final AccountClient accountClient;
//    private final CommissionRateService commissionRateService;

    @Override
    public Account getAccountDetail(String accountNo, BigDecimal paymentAmount) {
        System.out.println("accountNo=" + accountNo + " " + "paymentAmount=" + paymentAmount);
        var branchCode = getBranchCode(accountNo);
        System.out.println("branchCode=" + branchCode);
        var clientAccountDetail = accountClient.getAccountDetail(accountNo, branchCode);
        System.out.println("clientAccountDetail=" + clientAccountDetail);
        checkCBSError(clientAccountDetail);
        var accountDetail = clientAccountDetail.getFCUBSBODY().getCustAccountFull();
        return Account.builder()
                .accountNo(accountDetail.getACC())
                .customerName(accountDetail.getCUSTNAME())
                .balance(accountDetail.getAmountDates().getLCYCURRBALANCE())
                .branch(accountDetail.getBRN())
                .build();
    }

    private String getBranchCode(String accountNo) {
        return accountNo.substring(0, 3);
    }

    private void checkCBSError(QUERYCUSTACCIOFSRES rep) {
        if (!rep.getFCUBSBODY().getFCUBSERRORRESP().isEmpty()) {
            List<CBSError> errors = new ArrayList<>();
            for (ERRORType errorType : rep.getFCUBSBODY().getFCUBSERRORRESP()) {
                for (ERRORDETAILSType errordetailsType : errorType.getERROR()) {
                    log.error(errordetailsType.getECODE() + " " + errordetailsType.getEDESC());
                    CBSError cbsError = new CBSError(errordetailsType.getECODE(), errordetailsType.getEDESC());
                    errors.add(cbsError);
                }
            }
            throw new CBSException("Failed to Query customer balance", errors);
        }
    }
}
