package com.conf;

import com.bean.MyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration

//@PropertySource代表引入外部的.properties资源文件
//@PropertySources嵌套@PropertySource引入多个外部资源文件
@PropertySource("classpath:db.properties")
public class AppConfig50 {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;
    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public MyDataSource datasource() {
        return new MyDataSource(username, password, url, driverClass);
    }

}




