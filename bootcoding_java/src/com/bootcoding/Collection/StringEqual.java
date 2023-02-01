package com.bootcoding.Collection;

public class


StringEqual {
    public static void main(String[] args) {


        String s1 = "bootcoding";
        String s2=new String("bootcoding");
        String s3=s1;

        if(s1==s2){
            System.out.println("refrence of s1 and s2 are same");
        }
        else{
            System.out.println("refrence of s1 and s2 are not same ");
        }
        if(s1.equals(s2)){
            System.out.println("comntains of s1 and s2 are same");
        }
        else{
            System.out.println("contains of s1 and s2 are diff");
        }
        if(s1==s3){
            System.out.println("refrence of s1 and s3 are same");
        }
        else{
            System.out.println("refrence of s1 and s3 are not same ");
        }
        if(s1.equals(s3)){
            System.out.println("comntains of s1 and s3 are same");
        }
        else{
            System.out.println("contains of s1 and s3 are diff");
        }
    }
}
