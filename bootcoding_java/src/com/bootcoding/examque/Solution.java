package com.bootcoding.examque;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

           String answer="";
           Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           answer=(num%2!=0)?"Weird":(num>=2 && num<=5)?"Not Weird":(num>=6 && num<=20)?"Weird":"Not Weird";
           System.out.println(answer+" ");
           
    
    }
}