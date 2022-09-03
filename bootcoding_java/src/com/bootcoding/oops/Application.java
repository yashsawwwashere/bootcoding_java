package com.bootcoding.oops;

public class Application {

    public static void main(String[] args) {
        Marker2 n = new Marker2();
        n.setCompary("apsra");
        n.setTypr("bold");
        n.setColor("cream");
        n.setPrice(10);
        System.out.println(n.getCompary());
        System.out.println(n.getColor());
        System.out.println(n.getTypr());
        System.out.println(n.getPrice());

    }
}
