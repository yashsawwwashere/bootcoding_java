package com.bootcoding.basic;

public class GradeSystem {

    public static char[] getGrade(int []a){
        char[] grad=new char[a.length];
        for(int i=0;i<a.length;i++){
            grad[i]=GradeSystem.checkGrade(a[i]);
        }
        return grad;
    }

    public static char checkGrade(double percent){
        if(percent>=75){
            return 'A';
        }
        if (percent>=60){
            return 'B';
        }
        return 'c';
    }
    public static void main(String[] args) {

        int[] a = {60, 90, 40, 20};

        for(Character ch : GradeSystem.getGrade(a)){
            System.out.println(ch);
        }
    }

}