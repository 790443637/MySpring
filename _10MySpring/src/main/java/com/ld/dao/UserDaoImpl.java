package com.ld.dao;

import com.ld.myadvice.MyException;

import javax.xml.registry.infomodel.User;

public class UserDaoImpl implements UserDao{
    public String eat() {
        System.out.println("*********吃********");
        if(1==1){
            throw  new  MyException("错误了");
        }
        return "翔";
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
