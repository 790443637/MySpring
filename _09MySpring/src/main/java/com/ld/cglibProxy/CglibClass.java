package com.ld.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibClass implements MethodInterceptor{

    private Enhancer enhancer=new Enhancer();

    public Object creatProxy(Class cla){
        enhancer.setSuperclass(cla);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("后");
        return o1;
    }

    public static void main(String[]args){
        CglibClass cglibClass=new CglibClass();
        SomeBean sb= (SomeBean) cglibClass.creatProxy(new SomeBean().getClass());
        sb.print1();
    }



}



