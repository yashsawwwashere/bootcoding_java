package com.bootcoding.Exception;

public class MyException extends Exception{
    public MyException(String message){
        super();

    }
    public MyException(String message,Throwable t){
        super(message,t);
    }
}
