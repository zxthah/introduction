package com.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvolveBean
{
    private SomeBean someBean;
    public void init()
    {
        System.out.println("===init====");
    }

    public void destroy() {
        System.out.println("====destroy=====");
    }

}

