package com.bootcoding.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sqrt=new SquareRoot();
        int x=4;
        System.out.println(sqrt.mySqrt(x));
    }
    public int mySqrt(int x) {
        double t;
        double sqrtroot=x/2;
        int v=0;
        if(x==0 || x==1){
            return x;
        }
        do{
            t=sqrtroot;
            sqrtroot=(t+(x/t))/2;
        }
        while((t-sqrtroot)!= 0);

        return (int)Math.floor(sqrtroot);

    }
}
