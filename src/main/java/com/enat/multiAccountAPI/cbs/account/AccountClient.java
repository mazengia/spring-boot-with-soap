package com.enat.multiAccountAPI.cbs.account;

import com.enat.multiAccountAPI.cbs.CBSParameters;
import com.enat.multiAccountAPI.wsdl.account.*;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import static com.enat.multiAccountAPI.cbs.CBSParameters.ACCOUNT_OPERATION_NAME;
import static com.enat.multiAccountAPI.cbs.CBSParameters.ACCOUNT_SOURCE_ID;

@RequiredArgsConstructor
public class AccountClient extends WebServiceGatewaySupport {
    private final String host;
    private final String makerUser;

    public QUERYCUSTACCIOFSRES getAccountDetail(String account) {
        QUERYCUSTACCIOFSREQ request = new QUERYCUSTACCIOFSREQ();
        FCUBSHEADERType fcubsheaderType = new FCUBSHEADERType();
        fcubsheaderType.setOPERATION(ACCOUNT_OPERATION_NAME);
        fcubsheaderType.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheaderType.setUSERID(makerUser);
        fcubsheaderType.setMODULEID(CBSParameters.ACCOUNT_MODULE_ID);
        fcubsheaderType.setSOURCE(ACCOUNT_SOURCE_ID);
        fcubsheaderType.setSERVICE(CBSParameters.ACCOUNT_SERVICE_NAME);
        fcubsheaderType.setSOURCEOPERATION(ACCOUNT_OPERATION_NAME);
        request.setFCUBSHEADER(fcubsheaderType);
        fcubsheaderType.setBRANCH(getBranchCode(account));
        fcubsheaderType.setSOURCEUSERID(makerUser);


        QUERYCUSTACCIOFSREQ.FCUBSBODY fcubsbody = new QUERYCUSTACCIOFSREQ.FCUBSBODY();
        var custAccBalanceQueryIOType = new CustAccBalanceQueryIOType();
        custAccBalanceQueryIOType.setBRANCH(getBranchCode(account));
        custAccBalanceQueryIOType.setCUSTACNO(account);
        CustAccQueryIOType custAccQueryIOType = new CustAccQueryIOType();
        custAccQueryIOType.setBRN(getBranchCode(account));
        custAccQueryIOType.setACC(account);
        fcubsbody.setCustAccountIO(custAccQueryIOType);
        request.setFCUBSBODY(fcubsbody);
        return (QUERYCUSTACCIOFSRES) getWebServiceTemplate()
                .marshalSendAndReceive(host, request);
    }

    private String getBranchCode(String accountNo) {
        return accountNo.substring(0, 3);
    }
}