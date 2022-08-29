package com.bootcoding.basic;

public class Reverse {
   static public void number() {
       int a[] = {5, 7, 8, 11, 13};
       int n = a.length;


       for (int i = 0; i < n / 2; i++) {
           int temp = a[i];
           a[i] = a[n - 1 - i];
           a[n - i - 1] = temp;

       }
       for (int i = 0; i < n ; i++){
           System.out.print(a[i]);

       }


   }


        public static void main(String args[]) {
           Reverse.number();

        }
    }