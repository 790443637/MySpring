package com.ld.damian;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor的无参构造");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor的postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor的postProcessAfterInitialization");
        return bean;
    }
}
