package com.ld;

import com.ld.domain.Person;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

    @Test
    public void test() throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-context.xml");
        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }

    @Test
    public void test2() throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-context.xml","Dog-context.xml");
        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }
}
