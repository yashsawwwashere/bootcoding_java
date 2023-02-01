package com.bootcoding.Exception;

public class UserServiceException extends Exception {
    public UserServiceException(String message){
        super();
        System.out.println("User service is invoke");

    }
    public UserServiceException(String message,Throwable t){
        super(message,t);
        System.out.println("");
    }

}
