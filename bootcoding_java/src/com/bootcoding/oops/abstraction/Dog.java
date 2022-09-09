package com.bootcoding.oops.abstraction;

public  class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("eating food");
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void run() {
        System.out.println("fast");

    }
}
