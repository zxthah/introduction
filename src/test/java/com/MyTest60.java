package com;

import com.bean.MyDataSource;
import com.conf.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("pro")
public class MyTest60 {
    @Autowired
    private MyDataSource datasource;

    @Test
    public void test() {
        System.out.println(datasource);
    }
}

