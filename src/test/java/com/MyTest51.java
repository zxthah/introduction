package com;

import com.bean.MyDataSource;
import com.conf.AppConfig51;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig51.class)
public class MyTest51 {
    @Autowired
    private MyDataSource datasource;

    @Test
    public void test() {
        System.out.println(datasource);
    }
}

