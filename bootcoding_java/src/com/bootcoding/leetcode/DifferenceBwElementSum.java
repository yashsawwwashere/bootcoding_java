package com.bootcoding.leetcode;

public class DifferenceBwElementSum {
    public int differenceOfSum(int[] nums){
        int element=0;
        int digit=0;

         for(int num:nums) {
             element = element + num;

             while (num > 0) {

                 digit = digit + num % 10;
                 num = num / 10;
             }
         }return Math.abs(element-digit);
    }







    public static void main(String[] args) {
        DifferenceBwElementSum es=new DifferenceBwElementSum();
        int[] n={1,15,6,3};
        System.out.println(es.differenceOfSum(n));

    }
}
