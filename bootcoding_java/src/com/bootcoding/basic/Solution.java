package com.bootcoding.basic;

import javax.imageio.stream.ImageInputStream;

public class Solution {
    public int[] twoSum(int[] a, int target) {



        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    return new int[] { i, j };


                }

            }
        }
        return new int[] {};



    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int a[]={3,2,4};
        System.out.println(s.twoSum(a,9));


    }

}
