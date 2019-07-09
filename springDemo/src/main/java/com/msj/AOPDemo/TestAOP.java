package com.msj.AOPDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void testaop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean04.xml");
        AAA aa = context.getBean("aa",AAA.class);
        aa.say();
    }
}
