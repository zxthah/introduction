package com.conf;

import com.bean.CoverBean;
import com.bean.OtherBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepConfig0 {
    //第一种方式(对象的注入)
    @Bean
    public CoverBean coverbean(OtherBean otherbean) {
        CoverBean cBean = new CoverBean();
        cBean.setOtherBean(otherbean);
        return cBean;
    }

    @Bean
    public OtherBean otherbean() {
        return new OtherBean();
    }
}