package com.bootcoding.onlinetest;

public class Rc {
    public boolean power(int n){
        if(n==0)
        return false;

        if(n==1)
            return true;
        if(n%2!=0)
            return false;
        return power(n/2);
    }

    public static void main(String[] args) {
        Rc r=new Rc();
        System.out.println(r.power(16));
    }
}
