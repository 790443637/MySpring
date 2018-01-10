package com.ld.service;


import com.ld.domain.Employee;

public class EmployeeTranscationService implements IEmployeeService{
	
	private IEmployeeService target;
	
	public EmployeeTranscationService(IEmployeeService service){
		this.target=service;
	}
	
	public void save(Employee e) {
		System.out.println("sessionactory.getCurrentSession");
		System.out.println("sessionactory.getTranscation().begin()");
		target.save(e);
		System.out.println("sessionactory.getTranscation().commit()");
	}

	public void update(Employee e) {
		System.out.println("sessionactory.getCurrentSession");
		System.out.println("sessionactory.getTranscation().begin()");
		target.update(e);
		System.out.println("sessionactory.getTranscation().commit()");
	}
}
