package com.ld.myadvice;

public class MyException extends RuntimeException{

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }

    public MyException(String msg,Throwable e){
        super(msg,e);
    }
}
