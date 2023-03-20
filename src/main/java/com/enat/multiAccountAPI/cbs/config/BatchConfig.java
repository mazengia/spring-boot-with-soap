package com.enatbanksc.payment.config;

import com.enatbanksc.payment.cbs.batch.BatchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class BatchConfig {
    @Value("${client.batch-uri}")
    private String host;
    @Value("${client.maker-user}")
    private String makerUser;
    @Value("${client.authorizer-user}")
    private String authorizerUser;
    @Value("${client.user.name}")
    private String username;
    @Value("${client.user.password}")
    private String password;
    @Autowired
    public HttpComponentsMessageSender httpComponentsMessageSender;

    @Bean
    public Jaxb2Marshaller marshallerBatch() {
        var marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.enatbanksc.batch.wsdl");
        return marshaller;
    }

    @Bean
    public BatchClient batchClient(Jaxb2Marshaller marshallerBatch) {
        var client = new BatchClient( host, makerUser, authorizerUser);
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshallerBatch);
        client.setUnmarshaller(marshallerBatch);
        client.setWebServiceTemplate(webServiceTemplate(marshallerBatch));
        return client;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri(host);
        // set a HttpComponentsMessageSender which provides support for basic authentication
        webServiceTemplate.setMessageSender(httpComponentsMessageSender);

        return webServiceTemplate;
    }
}
