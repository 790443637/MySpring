package com.ld;

import com.ld.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

    @Test
    public void test1() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        String eat = userDao.eat();
        System.out.println(eat);
        userDao.sleep();
    }

    @Test
    public void test2() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        String eat = userDao.eat();
        System.out.println(eat);
        userDao.sleep();
    }
}
