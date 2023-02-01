package com.bootcoding.Exception;

public class UserDao {
    public void test() throws NumberFormatException{
        int num=Integer.parseInt("23");
        num=num/0;
    }
}
