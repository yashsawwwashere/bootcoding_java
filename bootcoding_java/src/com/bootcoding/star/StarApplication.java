package com.bootcoding.star;

public class StarApplication {
    public static void main(String[] args) {
        /*
          **
          ***
          ****
          *****
        */



       for(int i=0;i<5;i++){
            for(int j=1;j<i+1;j++){
        System.out.print("*");



            }
            System.out.println("*");
    }
        for(int i=4;i>0;i--){
            for(int j=0;j<i-1;j++){
                System.out.print("*");



            }
            System.out.println("*");

        }

}}
