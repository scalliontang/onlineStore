package com.sicongtang.onlineShop;

import com.sicongtang.onlineShop.log.Logger;
import com.sicongtang.onlineShop.log.PaymentAction;
import com.sicongtang.onlineShop.log.ServerLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
public class ApplicationConfig {

    @Bean(name = "sessionFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("onlineShop.entity");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://YOUR_RDS_IP:3306/ecommerce?createDatabaseIfNotExist=true&serverTimezone=UTC");
        dataSource.setUsername("USERNAME");
        dataSource.setPassword("PASSWORD");

        return dataSource;
    }


    private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect"); // if mysql version is 8, MySQL5InnoDBDialect
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        return hibernateProperties;
    }


}
