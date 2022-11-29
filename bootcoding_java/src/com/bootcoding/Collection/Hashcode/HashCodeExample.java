package com.bootcoding.Collection.Hashcode;

import java.util.HashMap;

public class HashCodeExample {
    public static void main(String[] args) {
        HashCodeExample hc= new HashCodeExample();
        HashMap<Restaurant,Integer> map=new HashMap<>();
        map.put(new Restaurant("Barbaque nation","nagpur","NON_VEG"),1);
        map.put(new Restaurant("haldram","nagpur","NON_VEG"),2);
        map.put(new Restaurant("baba biryani","nagpur","NON_VEG"),3);
        map.put(new Restaurant("ram bhandar","nagpur","VEG"),4);
        map.put(new Restaurant("chaska","nagpur","VEG"),5);
        System.out.println(map.get(new Restaurant("ram bhandar","nagpur","VEG")));
    }
}
