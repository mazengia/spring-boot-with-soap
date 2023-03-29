package com.enat.multiAccountAPI;

import com.enat.multiAccountAPI.config.AuditorAwareImpl;
import com.enat.multiAccountAPI.config.util.ApplicationProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties({ ApplicationProps.class})
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
