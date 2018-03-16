package com.ld.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class MyAspect {

        /**
         * 声明一个<aop:pointcut expression="execution(* com.ld.service.SomeBean*.*(..))" id="pc"/>
         */
        @Pointcut("execution(* com.ld.service.SomeBean*.*(..))")
        public void pc(){}
        /**
         * 在方法执行之前执行
         *@Before相当于<aop:before method="before" pointcut-ref="pc"/>
         *1.可以直接写pointcut表达式
         *2.可以使用定义好的pointcut
         */
        @Before("pc()")
        public void before(){
            System.out.println("前置增强");
        }
        /**
         * 在方法正常执行之后执行，报错就不会执行
         */
        @AfterReturning("pc()")
        public void afterReturning(){
            System.out.println("后置增强");
        }
        /**
         * 执行之后
         * 相当于在finally里面，不管是否报错都会执行after
         */
        @After("pc()")
        public void after(){
            System.out.println("最终增强");
        }

        /**
         * 在报错的时候执行
         * 如果要得到抛出的异常
         * 1.在方法中添加一个参数
         * 2.在<aop:after-throwing throwing="ex"/>这个throwing的值，必须和参数的名字一样
         */
        @AfterThrowing(pointcut="pc()",throwing="ex")
        public void afterThrowing(Throwable ex){
            System.out.println("异常增强:"+ex.getMessage());
        }
        /**
         * 环绕通知，把整个方法的通知全部包装起来
         * 要能够作为around的通知的方法，方法必须第一个参数是ProceedingJoinPoint
         * 在ProceedingJoinPoint中提供了一个proceed方法，这个方法能够让真实的方法继续向下执行
         */
        @Around("pc()")
        public Object around(ProceedingJoinPoint pjp){
            Object ret = null;
            try {
                System.out.println("环绕前置");
                ret = pjp.proceed();//proceed：执行真实方法，并返回真实方法执行的返回值
                System.out.println("环绕后置");
            } catch (Throwable ex) {
                System.out.println("环绕异常");
            }finally{
                System.out.println("环绕最终");
            }
            return ret;
        }
}
