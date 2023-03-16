package com.enat.multiAccountAPI.cbs.account;

import com.enat.multiAccountAPI.cbs.CBSParameters;
import com.enat.multiAccountAPI.wsdl.account.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import static com.enat.multiAccountAPI.cbs.CBSParameters.ACCOUNT_OPERATION_NAME;
import static com.enat.multiAccountAPI.cbs.CBSParameters.ACCOUNT_SOURCE_ID;

@Log4j2
@RequiredArgsConstructor
public class AccountClient extends WebServiceGatewaySupport {
    private final String host;
    private final String makerUser;
    public QUERYCUSTACCIOFSRES getAccountDetail(String account, String branch) {
        QUERYCUSTACCIOFSREQ request = new QUERYCUSTACCIOFSREQ();
        FCUBSHEADERType fcubsheaderType = new FCUBSHEADERType();
        fcubsheaderType.setOPERATION(ACCOUNT_OPERATION_NAME);
        fcubsheaderType.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheaderType.setUSERID(makerUser);
        fcubsheaderType.setMODULEID(CBSParameters.ACCOUNT_MODULE_ID);
        fcubsheaderType.setSOURCE(ACCOUNT_SOURCE_ID);
        fcubsheaderType.setSERVICE(CBSParameters.ACCOUNT_SERVICE_NAME);
        fcubsheaderType.setSOURCEOPERATION(ACCOUNT_OPERATION_NAME);
        fcubsheaderType.setBRANCH(branch);
        fcubsheaderType.setSOURCEUSERID(makerUser);
        request.setFCUBSHEADER(fcubsheaderType);
        QUERYCUSTACCIOFSREQ.FCUBSBODY fcubsbody = new QUERYCUSTACCIOFSREQ.FCUBSBODY();
        var custAccBalanceQueryIOType = new CustAccBalanceQueryIOType();
        custAccBalanceQueryIOType.setBRANCH(branch);
        custAccBalanceQueryIOType.setCUSTACNO(account);
        CustAccQueryIOType custAccQueryIOType = new CustAccQueryIOType();
        custAccQueryIOType.setBRN(branch);
        custAccQueryIOType.setACC(account);
        fcubsbody.setCustAccountIO(custAccQueryIOType);
        request.setFCUBSBODY(fcubsbody);
        System.out.println("marshalSendAndReceive="+ getWebServiceTemplate().marshalSendAndReceive("http://10.1.22.100:7003/FCUBSAccService/FCUBSAccService", request));
        return (QUERYCUSTACCIOFSRES) getWebServiceTemplate().marshalSendAndReceive("http://10.1.22.100:7003/FCUBSAccService/FCUBSAccService", request);
    }

}