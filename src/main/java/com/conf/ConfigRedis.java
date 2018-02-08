package com.conf;

import com.bean.MyRedisTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRedis {
    @Bean
    public MyRedisTemplate myRedisTemplate() {
        return new MyRedisTemplate();
    }
}