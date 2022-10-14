package com.bootcoding.leetcode;

public class Solution {
    public static void plusOne(int[] digits) {

        int n=digits.length;
        int num=0;

        for(int i=0;i<n;i++) {
            num = num * 10 + digits[i];
        }
            System.out.println(num);
        num=num+1;

        // Find number of digits like 3 in 123, 4 in 1234, to declare new array of size
        int numberOfDigits = 0;
        int num2 = num;
       while(num2 > 0){
           num2 = num2 / 10;
            numberOfDigits++;
        }

        int[] b=new int[numberOfDigits];
        for(int i=b.length-1;i>=0;i--){
            b[i] = num % 10;
            num = num / 10;
        }

        for(int i =0; i< b.length; i++){
            System.out.print(b[i] + " ");
        }


    }

    public static void main(String[] args) {
        int[] a={3,2,4};

        Solution.plusOne(a);




    }


}
