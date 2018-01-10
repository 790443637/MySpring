package com.ld.damian;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.test.annotation.SystemProfileValueSource;

import java.beans.PropertyDescriptor;

public class MyInitAwareBeanpostAdpater extends InstantiationAwareBeanPostProcessorAdapter{

    public MyInitAwareBeanpostAdpater() {
        System.out.println("MyInitAwareBeanpostAdpater的无参构造");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("*****执行了MyInitAwareBeanpostAdpater的postProcessBeforeInstantiation*****");
        return null;
    }

    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("*****执行了MyInitAwareBeanpostAdpater的postProcessAfterInitialization*****");
        return bean;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("*****执行了MyInitAwareBeanpostAdpater的postProcessPropertyValues*****");
        return pvs;
    }
}
