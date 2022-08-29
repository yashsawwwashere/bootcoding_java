package com.bootcoding.basic;

public class FibonacciSeriesM2 {
   static public int[] getfiboOf(int n) {
        int res[] = new int[n];
        int p1 = 1, p2 = 1, sum = 1;
        for (int i = 1; i < n; i++) {


            System.out.println(sum);
            p2 = p1;
            p1 = sum;
            sum = p1 + p2;


        }
        return res;
    }


    public static void main(String args[]) {
        FibonacciSeriesM2 sc=new FibonacciSeriesM2();
            sc.getfiboOf(6);





    }
}



