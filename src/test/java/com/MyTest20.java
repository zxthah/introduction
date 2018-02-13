package com;

import com.bean.ServBean;
import com.conf.CompConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompConfig.class)
public class MyTest20 {
    @Autowired
    @Qualifier(value = "servBean")
    private ServBean servBean;
    @Test
    public void test1() {
            System.out.println(servBean.toString());
        }
}
