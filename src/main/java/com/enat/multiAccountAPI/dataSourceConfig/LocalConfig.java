package com.enat.multiAccountAPI.dataSourceConfig;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mainEntityManagerFactory",
        transactionManagerRef = "mainTransactionManager",
        basePackages = {
                "com.enat.multiAccountAPI.local.accountType",
                "com.enat.multiAccountAPI.local.newAccounts"
//                ,"com.enat.multiAccountAPI.cbs.account",
//                "com.enat.multiAccountAPI.local.cbs.batch"
        }
)
public class LocalConfig {
    @Primary
    @Bean(name = "customerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource customerDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "mainEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("customerDataSource") DataSource customerDataSource
    ) {
        return builder
                .dataSource(customerDataSource)
                .packages(
                        "com.enat.multiAccountAPI.local.accountType",
                        "com.enat.multiAccountAPI.local.newAccounts"
//                        ,"com.enat.multiAccountAPI.local.cbs.account",
//                        "com.enat.multiAccountAPI.local.cbs.batch"
                )
                .build();
    }

    @Primary
    @Bean(name = "mainTransactionManager")
    public PlatformTransactionManager mainTransactionManager(
            @Qualifier("mainEntityManagerFactory") EntityManagerFactory mainEntityManagerFactory
    ) {
        return new JpaTransactionManager(mainEntityManagerFactory);
    }
}
