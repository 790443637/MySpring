package com.ld;

import com.ld.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

    @Test
    public void test1() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        String eat = userDao.eat();
        userDao.sleep();
    }

    @Test
    public void test2() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        UserDao userDao = context.getBean("userDao2", UserDao.class);
        String eat = userDao.eat();
        userDao.sleep();
    }
}
