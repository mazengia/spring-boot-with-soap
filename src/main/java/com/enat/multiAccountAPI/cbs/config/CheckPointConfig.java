package com.enat.multiAccountAPI.cbs.config;

import com.enat.multiAccountAPI.chequepoint.CheckPointClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
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
        marshaller.setContextPath("com.enat.multiAccountAPI.wsdl.chequepoint");
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

}
