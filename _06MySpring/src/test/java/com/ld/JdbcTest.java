package com.ld;

import com.ld.dao.IEmployeeDao;
import com.ld.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTest {

    @Autowired
    @Qualifier("EmployeeDaoImpl2")
    private IEmployeeDao dao;


    @Test
    public void testSave() throws Exception {
        Employee e=new Employee();
        e.setName("小红");
        e.setPassword("6666");
        dao.save(e);
    }

    @Test
    public void testGet() throws Exception {
        Employee employee = dao.get(2L);
        System.out.println(employee);
    }

    @Test
    public void testUpdate() throws Exception {
        Employee e=dao.get(1L);
        e.setName("老王");
        dao.update(e);
    }

    @Test
    public void testList() throws Exception {
        List<Employee> list = dao.list();
        System.out.println(list);
    }

    @Test
    public void testList2() throws Exception {
        List<Employee> list = dao.list2();
        System.out.println(list);
    }

    @Test
    public void testdel() throws Exception {
        dao.delete(1L);
    }

}