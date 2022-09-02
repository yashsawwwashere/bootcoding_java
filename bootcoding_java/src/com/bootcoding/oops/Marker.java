package com.bootcoding.oops;

public class Marker {

        String compary;
        String color;
        String typr;
        double price;

        public void fillMarker(){
            System.out.println("Fill Marker");
        }
        public Marker(){
            System.out.println("Marker object Created");
        }
        public void print(){
            System.out.println(compary);
            System.out.println(color);
            System.out.println(typr);
            System.out.println(price);
        }

    public static void main(String[] args) {
        Marker m1 = new Marker();

        m1.color="blue";
        m1.compary="Apsara";
        m1.price=20;
        m1.typr="Blue Marker";

        m1.fillMarker();
        m1.print();

    }
}
