package com.ld.service;


import com.ld.domain.account;
import com.ld.domain.stock;
import com.ld.mapper.accountMapper;
import com.ld.mapper.stockMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BuyStockServiceImpl implements  BuyStockService {

    //创建 账户和股票接口的对象
    @Resource
    private accountMapper am;
    @Resource
    private stockMapper sm;

    public void buyStock(String name, double money, int amount) {
        account a=new account();
        stock s=new stock();
        a.setAname(name);
        a.setBalance(money);
        //一人减钱
        am.updateAccount(a);
        if (1==1){
            throw  new BuyStockException("购买股票失败！");
        }
        //一人加股
        s.setSname(name);
        s.setAmount(amount);
        sm.updateStock(s);

    }
}
