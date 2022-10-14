package com.bootcoding.oops.Polymorphism;

public class Calculator {
    public int add(int a,int b){
        int add=a+b;

        return add;
    }
    public int add(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        return sum;


    }
    public double add(int d,double e){
        double sum=d+e;


        return sum;
    }
}
