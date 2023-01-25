package com.bootcoding.Collection.Linklist;

import java.util.LinkedList;
import java.util.List;

public class EvenNo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<Integer>();
        int[] a={2,3,4,5,6,7,8,};
        for(int i=0;i<a.length;i++){
        list.add(a[i]);}
//        list.add(24);
//        list.add(25);
//        list.add(26);
//        list.add(27);

        for(Integer in:list){
            if(in%2==0){
                System.out.println("no.is even");

            }
            else{
                System.out.println("no. is odd");
            }

        }
        //[1,2,1] -> [1,2,1,1,2,1]
        // INT B = new int [ a.length * 2];
        // 




    }
}
