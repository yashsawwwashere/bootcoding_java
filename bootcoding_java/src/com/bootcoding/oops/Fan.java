package com.bootcoding.oops;

public class Fan {
   final int max_speed=5;
    final int min_speed=0;

    int Speed;
    public int regulator(int newSpeed){


        Speed=newSpeed;
        if(Speed>max_speed){
            Speed=max_speed;
        }
        else if(Speed<min_speed){
            Speed=min_speed;
        }
        return Speed;

    }
}
