package com.ld.myadvice;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice{

    public void afterThrowing(MyException e){
            System.out.println("异常通知");
            System.out.println(e.getMessage());
    }
}
