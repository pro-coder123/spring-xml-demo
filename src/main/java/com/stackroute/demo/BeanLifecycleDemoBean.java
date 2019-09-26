package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {

        System.out.println("Destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Initialized");

    }
    public void custominit()
    {
        System.out.println("Custom Initialized");

    }


    public void customdestroy()
    {
        System.out.println("Custom Destroyed");
    }



}

