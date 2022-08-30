package com.bootcoding.basic;

public class CalculateAge {
    public int ageCalculate(int age){
        age=365*age;
        return age;




    }

    public static void main(String[] args) {
        CalculateAge ag=new CalculateAge();
        System.out.println(ag.ageCalculate(8)+"days");

    }

}
