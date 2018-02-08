package com.conf;

import com.bean.MyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

//生产环境的配置对象
@Configuration
@Profile("pro")
@PropertySource("classpath:db-profile.properties")
public class ConfigPro {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;
    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    public MyDataSource datasource() {
        return new MyDataSource(username, password, url, driverClass);
    }
}