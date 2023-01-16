package com.bootcoding.problemsleetcode;

public class pilandromeNo {
    public boolean noIsPalindrom(int x) {
        int r;
        int sum = 0;
        int temp=x;



        for (int i = 0; i <=temp; i++) {
            r = x % 10;  //getting remainder
            sum = (sum * 10) + r;
            x = x / 10;
        }
        if(temp<0)
            return false;

        else if
            (temp == sum)
                return true;


        else {
            return false;
        }
    }
    public static void main(String[] args) {
        pilandromeNo pl=new pilandromeNo();
        int a=10;
        System.out.println(pl.noIsPalindrom(a));
    }
}
