package com.conf;

import com.bean.CoverBean;
import com.bean.OtherBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepConfig1 {
    //第二种方式
    @Bean
    public CoverBean coverbean() {
        CoverBean cBean = new CoverBean();
        cBean.setOtherBean(otherbean());
        return cBean;
    }

    @Bean
    public OtherBean otherbean() {
        return new OtherBean();
    }
}