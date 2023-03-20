package com.enatbanksc.payment.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "derash")
public class DerashConfiguration {
    private String url;
    private API api;

    @Data
    public static class API {
        private String key;
        private String secret;
    }
}


