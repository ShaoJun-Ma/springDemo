package com.msj.AOPDemo2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
//声明这是一个切面
public class logging {

    //声明一个切点
    @Pointcut("execution(* com.msj.AOPDemo2.*.*(..))")
    public void say(){}

    @Before("say()")
    public void before(){
        System.out.println("之前");
    }

    @After("say()")
    public void after(){
        System.out.println("之后");
    }
}
