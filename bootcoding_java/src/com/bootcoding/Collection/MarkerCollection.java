package com.bootcoding.Collection;

import com.bootcoding.oops.Marker;
import com.bootcoding.oops.Marker2;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {

        MarkerCollection m=new MarkerCollection();

        long st = Calendar.getInstance().getTimeInMillis();
        for(int i=1;i<=100000;i++){

            Marker2 m2=new Marker2();
            m2.setId(i);
            m2.setCompary("camlin"+i);
            m2.setColor("white"+i);
            m2.setTypr("blue");
            m2.setPrice((i+100)*2.5);


            m.addMarker(m2); // storing each Marker instance

        }

        m.printMarker();
        System.out.println("Total Time " + (Calendar.getInstance().getTimeInMillis() - st));
    }
}

