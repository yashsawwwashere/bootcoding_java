package com.bootcoding.basic;

public class Time {
    public int takeMinute(int i){
         i=60*i;
         return i;
    }




    public static void main(String[] args) {
        Time t=new Time();
        System.out.println(t.takeMinute(8)+"seconds");





    }

}
