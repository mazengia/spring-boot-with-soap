package com.enat.multiAccountAPI.chequepoint;

import com.enat.multiAccountAPI.wsdl.chequepoint.SubmitTxn;
import com.enat.multiAccountAPI.wsdl.chequepoint.SubmitTxnResponse;
import com.enat.multiAccountAPI.wsdl.chequepoint.UtilAPISubmitTxnRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

@Log4j2
@RequiredArgsConstructor
public class CheckPointClient extends WebServiceGatewaySupport {

    public SubmitTxnResponse createTransaction(CheckPointCreateTxnDTO createTxnDTO){
        SubmitTxn submitTxn=new SubmitTxn();
        UtilAPISubmitTxnRequest apiSubmitTxnRequest=new UtilAPISubmitTxnRequest();
        apiSubmitTxnRequest.setAppcode("MBK");
        apiSubmitTxnRequest.setApppassphrase("123456");
        apiSubmitTxnRequest.setAmount(createTxnDTO.getAmount());
        apiSubmitTxnRequest.setDebitaccount(createTxnDTO.getDebitAccount());
        apiSubmitTxnRequest.setAccname(createTxnDTO.getDebitAccountName());
        apiSubmitTxnRequest.setDestaccount(createTxnDTO.getDestinationAccount());
        apiSubmitTxnRequest.setDestaccname(createTxnDTO.getDestinationAccountName());
        apiSubmitTxnRequest.setDestbankswiftcode(createTxnDTO.getDestinationBankSwiftCode());
        apiSubmitTxnRequest.setOriginatorref(createTxnDTO.getOriginatorRef());
        apiSubmitTxnRequest.setRemarks(createTxnDTO.getRemarks());
        submitTxn.setSubmitTxnrequest(apiSubmitTxnRequest);
        return (SubmitTxnResponse) getWebServiceTemplate()

                .marshalSendAndReceive("http://10.1.22.155/FinInterface/FinInterface.asmx", submitTxn,message->((SoapMessage)message ).setSoapAction("https://www.fintech-group.com/services/Finpay/SubmitTxn"));
    }
}
