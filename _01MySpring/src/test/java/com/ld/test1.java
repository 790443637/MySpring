package com.ld;

import com.ld.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test1 {

    private StudentService s;

    @Autowired
    private BeanFactory factory;

    @Test
    public void test() throws Exception {
        s=factory.getBean("studentServiceImpl",StudentService.class);
        s.sleep();
    }
}
