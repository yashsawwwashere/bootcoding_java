package com.bootcoding.design_type;

import javax.swing.*;
import java.util.jar.JarEntry;

 interface sim {
    void start();

}
class Idea implements sim{

    @Override
    public void start() {
        System.out.println("Idea sim initilized");

    }
}
class Airtel implements sim{

    @Override
    public void start() {
        System.out.println("Airtel sim initilized");

    }
}
class Jio implements sim {

    @Override
    public void start() {
        System.out.println("jio sim initilized");

    }
}
class Magic{

    public void ShowMagic(sim sim){
        System.out.println("start");
        sim.start();
        System.out.println("end ");
    }
}
class Demo{
    public static void main(String[] args) {
        Magic m=new Magic();
        Idea idea=new Idea();
        Jio jio=new Jio();
        Airtel airtel=new Airtel();
        m.ShowMagic(idea);
        m.ShowMagic(airtel);
        m.ShowMagic(jio);
    }
}
