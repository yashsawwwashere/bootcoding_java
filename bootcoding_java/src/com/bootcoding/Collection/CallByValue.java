package com.bootcoding.Collection;

public class CallByValue {
    public static void main(String[] args) {
        int b=10;
        add(b);
        System.out.println("main:"+b);
    }
    public static void add(int b){
         b=30;
        System.out.println("in change:"+b);
    }
}
