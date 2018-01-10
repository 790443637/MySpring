package com.ld;

import com.ld.domain.SomeBeanCon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ConDITest-context.xml")
public class ConDITest {


    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testCreate() throws Exception {
        SomeBeanCon bean = ctx.getBean("somebeanCon",SomeBeanCon.class);
        System.out.println(bean);
    }
}
