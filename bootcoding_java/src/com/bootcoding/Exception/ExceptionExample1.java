package com.bootcoding.Exception;

import java.util.Scanner;

public class ExceptionExample1 {



    public void testException() {
        do {
            try {

                Scanner sc = new Scanner(System.in);
                int i = Integer.parseInt(sc.next());
                System.out.println("value of Input :"+i);
                System.out.println("I am in try");
                break;
            }catch (Exception ex){
                System.out.println("only Integer number Supported!"+ex);
                ex.printStackTrace();
            }
        }while (true);
    }

    public static void main(String[] args) {
        ExceptionExample1 exceptionExample1 = new ExceptionExample1();
        exceptionExample1.testException();
    }
}
