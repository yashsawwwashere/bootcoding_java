package com.bootcoding.basic;
import java.util.*;

public class PersonEducation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(5>i){
            System.out.println("nursery");
        }
        else if (5<i&&15>i) {
            System.out.println("school-k10");

        }
        else if (15<i&&18>i) {
            System.out.println("high school-k12");

        }
        else if(19<i&&22>i){
            System.out.println("graduate");
        }








    }
}
