package com.bootcoding.Exception;

import java.util.Scanner;

public class ExceptionExample2 {

    public int checkException(){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        try {

            n = 10/n;


        }catch (Exception ex){
            System.out.println("I am in catch");
            ex.printStackTrace();
        }

        return n;
    }

    public static void main(String[] args) {

        ExceptionExample2 exceptionExample2 = new ExceptionExample2();

        System.out.println(exceptionExample2.checkException());
    }
}
