package com.ld.dao.impl;

import com.ld.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{


    public void sleep() {
        System.out.println("睡觉");
    }
    public String eat() {
        String s="吃饭";
        System.out.println("吃饭");
        return null;
    }
}
