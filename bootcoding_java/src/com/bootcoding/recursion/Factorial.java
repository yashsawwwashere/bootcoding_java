package com.bootcoding.recursion;

public class Factorial {

    public int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num-1);

    }

    public static void main(String[] args) {

    Factorial f=new Factorial();
        System.out.println( f.fact(1));
    }
}
