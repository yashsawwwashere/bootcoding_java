package com.bootcoding.oops.abstraction;

public class Goat extends Animal{
    @Override
    public void eat() {
        System.out.println("grass");
    }

    @Override
    public void sound() {
        System.out.println("maimaimai");

    }

    @Override
    public void run() {
        System.out.println("slow");
    }
}
