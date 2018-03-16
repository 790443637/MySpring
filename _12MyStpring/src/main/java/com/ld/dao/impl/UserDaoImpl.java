package com.ld.dao.impl;

import com.ld.dao.UserDao;

public class UserDaoImpl implements UserDao{

    public String eat() {
        System.out.println("吃饭");
        return null;
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
