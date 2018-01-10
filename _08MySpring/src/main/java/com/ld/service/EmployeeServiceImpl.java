package com.ld.service;

import com.ld.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{

	public void save(Employee e) {
		System.out.println(e);
	}

	public void update(Employee e) {
		System.out.println("dao.update(Employee e)");
	}

}
