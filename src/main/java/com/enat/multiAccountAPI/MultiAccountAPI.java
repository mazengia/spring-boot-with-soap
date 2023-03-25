package com.enat.multiAccountAPI;

import com.enat.multiAccountAPI.local.config.AuditorAwareImpl;
import com.enat.multiAccountAPI.local.config.DerashConfiguration;
import com.enat.multiAccountAPI.local.config.util.ApplicationProps;
import com.enat.multiAccountAPI.local.config.util.EATSConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties({DerashConfiguration.class, EATSConfig.class, ApplicationProps.class})
@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@EnableScheduling
public class MultiAccountAPI {
    @Bean
    AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl();
    }
    public static void main(String[] args) {
        SpringApplication.run(MultiAccountAPI.class, args);
    }
}
