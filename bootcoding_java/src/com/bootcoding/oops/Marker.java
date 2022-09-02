package com.bootcoding.oops;

public class Marker {

        String compary;
        String color;
        String typr;
        double price;

        public void fillMarker(){
            System.out.println("Fill Marker");
        }
        public Marker(String cmp,String clr,String t,double p){
            compary=cmp;
            color=clr;
            typr=t;
            price=p;
        }
        public void print(){
            System.out.println(compary);
            System.out.println(color);
            System.out.println(typr);
            System.out.println(price);
        }

    public static void main(String[] args) {
        Marker m2 = new Marker("Natraj","Black","Black pen",127.00);

        m2.fillMarker();
        m2.print();

    }
}
