package com.ld;

import com.ld.domain.Employee;
import com.ld.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:StaticProxyTest-context.xml")
public class StaticProxyTest {
	
	@Autowired
	@Qualifier("employeeService")
	private IEmployeeService service;
	
	@Test
	public void testSave() throws Exception {
		service.save(new Employee(5L,"小红"));
	}
}
