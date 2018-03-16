package com.ld.service;

import org.springframework.stereotype.Service;

public class BuyStockException extends  RuntimeException {
    public  BuyStockException(String msg){
         super(msg);
    }
    public  BuyStockException(String msg,Throwable a){
         super(msg,a);
    }
}
