package com.ld.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

@Service
public class MyAspect {

    public void before() {
        System.out.println("前置增强");
    }

    public void afterReturning() {
        System.out.println("后置增强");
    }

    public void after() {
        System.out.println("最终增强");
    }

//    public void afterThrowing(Throwable ex) {
//        System.out.println("异常增强:" + ex.getMessage());
//    }
//
//    public Object around(ProceedingJoinPoint pjp) {
//        Object ret = null;
//        try {
//            System.out.println("环绕前置");
//            ret = pjp.proceed();//proceed：执行真实方法，并返回真实方法执行的返回值
//            System.out.println("环绕后置");
//        } catch (Throwable ex) {
//            System.out.println("环绕异常");
//        } finally {
//            System.out.println("环绕最终");
//        }
//        return ret;
//    }
}
