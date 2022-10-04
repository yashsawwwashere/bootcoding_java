package com.bootcoding.recursion;

public class Example1 {

    public void printNum(int n){


        if (n<1) {
            return ;
        }

        printNum(n-1);

        System.out.println(n);

    }

    public static void main(String[] args) {

        Example1 e = new Example1();

        e.printNum(15);

    }
}
