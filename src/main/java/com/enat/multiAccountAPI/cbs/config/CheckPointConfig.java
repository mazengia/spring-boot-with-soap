package com.enatbanksc.payment.config;

import com.enatbanksc.payment.chequepoint.CheckPointClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class CheckPointConfig {

    @Autowired
    public HttpComponentsMessageSender httpComponentsMessageSender;

    @Bean
    public Jaxb2Marshaller marshallerCheckPoint() {
        var marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.enatbanksc.chequepoint.wsdl");
        return marshaller;
    }

    @Bean
    public CheckPointClient checkPointClient(Jaxb2Marshaller marshallerCheckPoint) {
        var client = new CheckPointClient( );
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshallerCheckPoint);
        client.setUnmarshaller(marshallerCheckPoint);
//        client.setWebServiceTemplate(webServiceTemplate(marshallerCheckPoint));
        return client;
    }

//    @Bean
//    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
//        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
//        webServiceTemplate.setMarshaller(marshaller);
//        webServiceTemplate.setUnmarshaller(marshaller);
//        webServiceTemplate.setDefaultUri("http://10.1.22.155/FinInterface/FinInterface.asmx");
//        // set a HttpComponentsMessageSender which provides support for basic authentication
//        webServiceTemplate.setMessageSender(httpComponentsMessageSender);
//
//        return webServiceTemplate;
//    }
}
