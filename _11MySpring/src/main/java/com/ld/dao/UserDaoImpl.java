package com.ld.dao;


public class UserDaoImpl implements UserDao{
    public String eat() {
        System.out.println("*********吃********");
        return "翔";
    }

    public void sleep() {
        System.out.println("*********睡觉********");
    }
}
