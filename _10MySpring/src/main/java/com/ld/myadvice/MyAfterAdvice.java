package com.ld.myadvice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice{

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o);
        System.out.println("后置增强");
    }
}
