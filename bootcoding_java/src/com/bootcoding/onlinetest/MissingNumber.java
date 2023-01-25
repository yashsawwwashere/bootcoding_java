package com.bootcoding.onlinetest;

public class MissingNumber {
    public int missingNo(int [] a) {
        int n = a.length;
        int m = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < a.length; i++)
            m -= a[i];

        return m;

    }

    public static void main(String[] args) {
        MissingNumber mn=new MissingNumber();
        int[] a={1,2,3,5,6,7};
        System.out.println( mn.missingNo(a));
    }
}
