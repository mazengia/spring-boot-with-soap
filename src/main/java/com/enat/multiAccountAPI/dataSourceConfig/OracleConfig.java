package com.enat.multiAccountAPI.dataSourceConfig;
 import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.boot.context.properties.ConfigurationProperties;
 import org.springframework.boot.jdbc.DataSourceBuilder;
 import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 import org.springframework.orm.jpa.JpaTransactionManager;
 import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
 import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
 import org.springframework.transaction.PlatformTransactionManager;
 import org.springframework.transaction.annotation.EnableTransactionManagement;

 import javax.persistence.EntityManagerFactory;
 import javax.sql.DataSource;
 import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "oracleEntityManager",
        transactionManagerRef = "oracleTransactionManager",
        basePackages = "com.enat.multiAccountAPI.flex.accountHolder"
)



public class OracleConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.oracle.datasource")
    public DataSource oracleDataSource() {
        return DataSourceBuilder
                .create()
                .build();
    }

    @Bean(name = "oracleEntityManager")
    public LocalContainerEntityManagerFactoryBean oracleEntityManager() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(oracleDataSource());
        em.setPackagesToScan("com.enat.multiAccountAPI.flex.accountHolder");
        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", null);
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean(name = "oracleTransactionManager")
    public PlatformTransactionManager oracleTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(oracleEntityManager().getObject());
        return transactionManager;
    }}