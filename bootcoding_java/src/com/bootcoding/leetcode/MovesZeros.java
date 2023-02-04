package com.bootcoding.leetcode;

public class MovesZeros {
    public static void main(String[] args) {
        MovesZeros mz=new MovesZeros();
        int[] nums = {0,1,0,3,12};
        System.out.println(mz.moveZeroes(nums));

    }
    public int[] moveZeroes(int[] nums) {
        int[] a=new int[nums.length];
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                a[j]=nums[i];
                j++;

            }

        }return a;

    }
}

