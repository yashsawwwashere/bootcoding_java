package com.bootcoding.basic;
import java.util.*;


public class CalculateAmount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a,tax;
        System.out.println("enter the income");
        a = sc.nextDouble(); // 10 lac
        tax = 0;
        if(a<=500000) // < 5 lac
        {
            tax=(((a-500000)*10)/100);
        }
        else if(a<=1000000) // 10 lac
        {
            tax= ((a-500000)*10/100);
        }
        else if(a>1000000)
        {
            tax=((a-500000)*10/100)+((a-500000)*10/100)+((a-1000000)* 0.3);
        }
        System.out.println("total tax is  " +tax);
    }
}




