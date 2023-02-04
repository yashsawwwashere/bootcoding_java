package com.bootcoding.leetcode;

public class SingleNo {
    public static void main(String[] args) {
        int[]nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]==nums[j]){

                }
                else{
                    temp=nums[i];
                }
            }
        }return temp;

    }
}

