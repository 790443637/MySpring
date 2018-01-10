package com.ld;

import com.ld.domain.SomeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:applicationContext.xml")
    public class SetterDITest {

        @Autowired
        private ApplicationContext ctx;

        @Test
        public void testCreate() throws Exception {
            SomeBean bean = ctx.getBean("somebean",SomeBean.class);
            System.out.println(bean);
        }
    }
