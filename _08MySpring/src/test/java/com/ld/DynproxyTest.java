package com.ld;

import com.ld.domain.Employee;
import com.ld.service.IEmployeeService;
import com.ld.service.TranscationInvocationHanalder;
import com.ld.service.TranscationManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:DynproxyTest-context.xml")
public class DynproxyTest {
	
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private TranscationManager txManager;
	
	@Test
	public void testProxy() throws Exception {
		//Porxy：专门用来生产代理类的对象
		//newProxyInstance需要三个参数
		//1.classLoader:专门用来加载类的字节码,目标对象类的类加载器
		//2.interfaces:需要接口，代理对象和目标对象共同拥有的接口
		//3.实现了InvocationHandler接口的类
		IEmployeeService e = (IEmployeeService) Proxy.newProxyInstance(service.getClass().getClassLoader(),new Class[]{IEmployeeService.class},new TranscationInvocationHanalder(service,txManager));
		//返回的是代理对象(e)
		e.update(new Employee(16L,"小红"));
	}
}
