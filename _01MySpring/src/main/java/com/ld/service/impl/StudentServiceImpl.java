package com.ld.service.impl;

import com.ld.dao.StudentDao;
import com.ld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao dao;

//    public void setDao(StudentDao dao) {
//        this.dao = dao;
//    }
    public void sleep() {
        dao.sleep();
    }

    public String eat() {
        return dao.eat();
    }
}
