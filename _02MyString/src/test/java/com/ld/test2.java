package com.ld;

import com.ld.damian.Student;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

    @Test
    public void test() throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s = ctx.getBean("student", Student.class);
        System.out.println(s);
        ctx.registerShutdownHook();
    }
}
