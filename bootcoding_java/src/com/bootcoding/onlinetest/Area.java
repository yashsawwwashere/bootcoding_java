package com.bootcoding.onlinetest;

public class Area {
    public int areaOfTriangle(int base,int height){
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Area a=new Area();
        System.out.println(a.areaOfTriangle(4,5));
    }
}
