package com.bootcoding.basic;



public class FibonacciSeries {
    public static void main(String args[]){
        int p1=1,p2=1,sum=1,n=9;
        for(int i=1;i<n;i++){


            System.out.println(sum);
            p2=p1;
            p1=sum;
            sum=p1+p2;



        }





    }
}
