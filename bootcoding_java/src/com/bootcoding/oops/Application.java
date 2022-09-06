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



        Book javabooks=new Book();
        javabooks.setTitle("wings of fire");
        javabooks.setAuthor("sawra");
        javabooks.setDescription("based on rocket science");
        javabooks.setPublisherName("apj abdul kalam");
        javabooks.setPages(300);
        System.out.println(javabooks.getTitle());
        System.out.println(javabooks.getAuthor());
        System.out.println(javabooks.getDescription());
        System.out.println(javabooks.getPublisherName());
        System.out.println(javabooks.getPages());


        Cycle c=new Cycle();
        c.setBrakes("dis brake");
        c.setCompany("hero");
        c.setPrice(2000);
        c.setWheel(4);
        c.setType("kid cycle");
        System.out.println(c.getBrakes());
        System.out.println(c.getCompany());
        System.out.println(c.getTyers());
        System.out.println(c.getWheel());
        System.out.println(c.getType());









    }
}
