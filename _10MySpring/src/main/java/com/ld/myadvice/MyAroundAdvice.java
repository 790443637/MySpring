package com.ld.myadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前");
        Object proceed = invocation.proceed();
        if(proceed!=null){
            proceed= "两斤翔";
        }
        System.out.println("环绕后");
        return proceed;
    }
}
