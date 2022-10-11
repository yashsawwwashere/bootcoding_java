package com.bootcoding.Collection;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int a[],int target){
        int n=a.length;
        HashMap<Integer,Integer>twoSumMap=new HashMap<>();
        int []res=new int[2];
        for(int i=0;i<n;i++){
            if(twoSumMap.containsKey(a[i])){
                res[0]=twoSumMap.get(a[i]);
                res[1]=i;
            }
            else{
                twoSumMap.put(target-a[i],i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum t=new TwoSum();
        int b[]={2,7,11,15};


        int[] res = t.twoSum(b, 9);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
