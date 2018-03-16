package com.ld.domain;

import org.apache.ibatis.type.Alias;

@Alias("stock")
public class stock {

    private Integer sid;
    private String sname;
    private Integer amount;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
