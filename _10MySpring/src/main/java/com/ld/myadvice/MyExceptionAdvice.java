package com.ld.myadvice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyExceptionAdvice implements ThrowsAdvice{

    public void afterThrowing(MyException e){
            System.out.println("异常通知");
            System.out.println(e.getMessage());
    }
}
