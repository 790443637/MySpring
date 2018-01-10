package com.ld;

import com.ld.cglibProxy.LogInvocationHandler;
import com.ld.cglibProxy.SomeBean;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {


	@Test
	public void test1() throws Exception {
		SomeBean some=new SomeBean();
		//增强器
		Enhancer enhancer=new Enhancer();
		//设置目标对象的classLoader
		enhancer.setClassLoader(some.getClass().getClassLoader());
		//设置动态代理的父类
		enhancer.setSuperclass(SomeBean.class);
		//设置要传入的拦截器
		enhancer.setCallback(new LogInvocationHandler(some));
		//使用create方法创建代理对象
		SomeBean s = (SomeBean) enhancer.create();
		s.print2();
	}
}
