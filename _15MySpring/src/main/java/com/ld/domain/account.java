package com.ld.domain;

import org.apache.ibatis.type.Alias;
import org.aspectj.lang.annotation.Around;

import java.math.BigDecimal;

@Alias("account")
public class account {
    private Integer aid ;
    private double balance;
    private String aname;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "account{" +
                "aid=" + aid +
                ", balance=" + balance +
                ", aname='" + aname + '\'' +
                '}';
    }
}
