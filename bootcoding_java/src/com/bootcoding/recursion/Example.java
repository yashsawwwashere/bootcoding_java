package com.bootcoding.recursion;

public class Example {
    public void printEventOdd(int n){
        if (n<1) {
            return ;
        }

        if(n%2 == 0){
            System.out.println(n);
        }
        printEventOdd(n-1);
        if(n % 2 != 0){
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Example e1=new Example();
        e1.printEventOdd(10);
    }
}
