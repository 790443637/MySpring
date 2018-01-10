package com.ld;

import com.ld.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService s = (StudentService) context.getBean("studentServiceImpl");
        s.sleep();
    }

}
