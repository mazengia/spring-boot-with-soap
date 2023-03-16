package com.enat.multiAccountAPI.cbs.config;

import com.enat.multiAccountAPI.cbs.account.AccountClient;
import lombok.RequiredArgsConstructor;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
@RequiredArgsConstructor
public class AccountConfig {
    @Value("${client.account-uri}")
    private String host;
    @Value("${client.maker-user}")
    private String makerUser;
    @Value("${client.authorizer-user}")
    private String authorizerUser;
    @Value("${client.user.name}")
    private String username;
    @Value("${client.user.password}")
    private String password;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.enat.multiAccountAPI.wsdl.account");
        return marshaller;
    }

    @Bean
    public AccountClient accountClient(Jaxb2Marshaller marshaller) {
        AccountClient client = new AccountClient(host,makerUser);
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setWebServiceTemplate(accountWebServiceTemplate(marshaller));
        return client;
    }

    @Bean
    public WebServiceTemplate accountWebServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri("http://10.1.22.100:7003/FCUBSAccService/FCUBSAccService");
        // set a HttpComponentsMessageSender which provides support for basic authentication
        webServiceTemplate.setMessageSender(httpComponentsMessageSender());

        return webServiceTemplate;
    }
    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        // set the basic authorization credentials
        httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());

        return httpComponentsMessageSender;
    }

    @Bean
    public UsernamePasswordCredentials usernamePasswordCredentials() {
        // pass the user name and password to be used
        return new UsernamePasswordCredentials(username, password);
    }

}
