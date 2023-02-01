package com.bootcoding.leetcode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;
        if (n % 2 != 0){
            return false;
        }
        return isPowerOfTwo(n/2);

    }

    public static void main(String[] args) {
        PowerOfTwo pt=new PowerOfTwo();
        System.out.println(pt.isPowerOfTwo(1));

    }
}

