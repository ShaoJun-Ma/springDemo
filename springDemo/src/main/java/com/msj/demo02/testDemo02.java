package com.msj.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean02.xml");
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
