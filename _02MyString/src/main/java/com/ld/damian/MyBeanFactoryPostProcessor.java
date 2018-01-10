package com.ld.damian;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition student = beanFactory.getBeanDefinition("student");
        student.getPropertyValues().addPropertyValue("stuName","呵呵");
        System.out.println("MyBeanFactoryPostProcessor的postProcessBeanFactory方法");
    }
}
