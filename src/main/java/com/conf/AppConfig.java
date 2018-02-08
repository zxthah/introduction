package com.conf;

import com.bean.InvolveBean;
import com.bean.OtherBean;
import com.bean.SomeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

// 作为Spring的主配置文件@Configuration标签表示这个类可被Spring识别的配置对象的类
// 只有有这个标记的标签的类才能使用@Bean标签作用于对应的方法上面
@Configuration
@ImportResource("classpath:application.xml")
@Import({ConfigDataSource.class, ConfigRedis.class, AppConfig50.class,
        AppConfig51.class, ConfigDev.class, ConfigPro.class})
public class AppConfig { //@Bean标签表示让Spring帮我们管理bean
    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }

    @Bean(destroyMethod = "destroy", initMethod = "init")
    public InvolveBean involvebean(SomeBean somebean) {
        InvolveBean iBean = new InvolveBean();
        iBean.setSomeBean(somebean);
        return iBean;
    }
}





