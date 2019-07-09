package com.msj.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean01.xml");
        Hello hello1 = (Hello)context.getBean("hello1");
        Hello hello2 = (Hello)context.getBean("hello1");

        System.out.println(hello1);
        System.out.println(hello2);
        System.out.println(hello1==hello2);
    }
}
