package com;

import com.bean.MyDataSource;
import com.bean.MyRedisTemplate;
import com.conf.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MyTest40
{
    @Autowired
    private MyDataSource datasource;
    @Autowired
    private MyRedisTemplate redisTemplate;
    @Test
    public void test()
    {
        System.out.println(datasource);
        System.out.println(redisTemplate);
    }
}

