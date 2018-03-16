package com.ld.service;

import org.springframework.stereotype.Service;

@Service
public class SomeBeanImpl implements ISomeBean{

    public Integer someMethod(Integer arg){
        System.out.println("someMethod()");
        //int i=1/0;
        return arg+1;
    }
}
