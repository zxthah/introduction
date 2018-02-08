package com;

import com.bean.SomeBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        SomeBean sb = ctx.getBean(SomeBean.class);
        System.out.println(sb);

    }
}
