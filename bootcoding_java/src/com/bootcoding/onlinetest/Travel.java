package com.bootcoding.onlinetest;

public class Travel {
    public int distance(int dis){
        int fuulCost = dis*10;

        if(fuulCost>=100){
            return fuulCost;
        }
        return 100;
    }

    public static void main(String[] args) {
        Travel T=new Travel();
        System.out.println(T.distance(9));
    }
}
