package com.bootcoding.onlinetest;

public class football {
    public int points(int wins,int draw,int losses){

        wins=wins*3;
        draw=draw*1;
        losses=0;

        int matches=0;

        return matches=wins+draw+losses;


    }

    public static void main(String[] args) {
        football f=new football();
        System.out.println(f.points(5,2,0));
    }
}
