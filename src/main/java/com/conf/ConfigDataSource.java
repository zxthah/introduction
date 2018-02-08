package com.conf;

import com.bean.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDataSource {
    @Bean
    public MyDataSource myDatasource() {
        return new MyDataSource();
    }
}