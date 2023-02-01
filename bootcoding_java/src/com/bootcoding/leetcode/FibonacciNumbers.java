package com.bootcoding.leetcode;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fb=new FibonacciNumbers();
        int n=3;
        System.out.println(fb.fib(n));
    }
    public int fib(int n){

        if(n==0 && n==1){
          return n;

        }
        return fib(n-1)+fib(n-2);

    }
}
