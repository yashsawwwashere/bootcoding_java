package com.bootcoding.Collection;

import com.bootcoding.oops.Marker;
import com.bootcoding.oops.Marker2;

import java.util.*;

/*
*
* Requirement
*  1) Create 10 Marker instances
* 2) Store them (10 instances of Marker) into hashmap collection
* 3) Print all marker details
*
* */
public class MarkerCollection {
    private Map<Long, Marker2> markerStore = new HashMap<>() ;


    // Processing - keeping marker objects into Map collection

    public void addMarker(Marker2 m){
        markerStore.put(m.getId(), m);
    }


    // Processing - Printing all elements of Map Collection
    public void printMarker() {
        for (Marker2 m : markerStore.values()) {
            System.out.println("id:" + m.getId());
            System.out.println("company:" + m.getCompary());
            System.out.println("colour:" + m.getColor());
            System.out.println("type:" + m.getTypr());
            System.out.println("price:" + m.getPrice());
        }

    }
    public class RandomNumberGenerator {
        public static int generateNumber(int bound) {

            Random random = new Random();

            int i = random.nextInt(bound);

            return i;
        }

        public static void main(String[] args) {

            MarkerCollection m = new MarkerCollection();
            String[] colours = {"white", "black", "red","green"};



            for (int i = 1; i <= 100000; i++) {
                int num = generateNumber(colours.length);
                Marker2 m2 = new Marker2();
                m2.setId(i);
                m2.setCompary("camlin" + i);

                m2.setColor(colours[num]);
                m2.setTypr("blue");
                m2.setPrice((i + 100) * 2.5);


                m.addMarker(m2); // storing each Marker instance

            }

            m.printMarker();

        }
    }}

