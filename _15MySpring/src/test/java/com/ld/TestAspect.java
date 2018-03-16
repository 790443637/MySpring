package com.ld;

import com.ld.service.BuyStockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAspect {

    @Resource
    private BuyStockService buyStockServiceImpl;

    @Test
    public void test1() throws Exception {
        buyStockServiceImpl.buyStock("张三",5000.0,10);
    }
}
