package com.bootcoding.oops;

public class Dog extends Animal{
    public void bark() {
        System.out.println("katta hai re");
        eat();
        run();
    }
      public void  sleep(){
        super.sleep();
           System.out.println("sleep");

        }


    public void  type(){
        System.out.println("breed");

    }
    public void colour() {
        System.out.println("broen");
    }
}
