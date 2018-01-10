package com.ld.dao;

import com.ld.domain.Employee;

import java.util.List;

public interface IEmployeeDao {
    void save(Employee e);

    void update(Employee e);

    Employee get(Long id);

    void delete(Long id);

    List<Employee> list();

    List<Employee> list2();
}
