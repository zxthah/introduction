package com;

import com.bean.CompBean;
import com.bean.OtherBean;
import com.bean.SomeBean;
import com.conf.AppConfig;
import com.conf.CompConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest2 {
    @Test
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext cctx = new AnnotationConfigApplicationContext(CompConfig.class);
        OtherBean ob = ctx.getBean(OtherBean.class);
        CompBean cb = cctx.getBean(CompBean.class);
        System.out.println(ob);
        System.out.println(cb);

    }
}
