package com.ld.damian;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.naming.spi.InitialContextFactory;

public class Student implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{

    private int age;
    private String stuName;

    private String beanName;
    private BeanFactory beanFactory;

    public Student() {
        System.out.println("执行了Student的无参构造");
    }

    public void setBeanName(String beanName) {
        System.out.println("执行了BeanNameAware的setBeanName()");
        this.beanName=beanName;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("执行了BeanFactoryAware的setBeanFactory()");
        this.beanFactory=beanFactory;
    }

    public void init(){
        System.out.println("执行了Student的初始化方法");
    }

    public void des(){
        System.out.println("执行了Students的销毁方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
