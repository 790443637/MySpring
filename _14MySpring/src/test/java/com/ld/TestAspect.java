package com.ld;

import com.ld.service.ISomeBean;
import com.ld.service.MyAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring2.xml")
public class TestAspect {

    @Resource
    private ISomeBean someBean;

    @Test
    public void test1() throws Exception {
        System.out.println(someBean.someMethod(1));
    }
}
