package com.ld;

import com.ld.service.ISomeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring.xml")
public class AnnAOPTest {

    @Autowired
    private ISomeBean bean;

    @Test
    public void test1() throws Exception {
        System.out.println(bean.someMethod(1));
    }
}
