package com.bootcoding.leetcode;

public class NumberOFGoodPairs {
    public static void main(String[] args) {
        NumberOFGoodPairs ngp=new NumberOFGoodPairs();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(ngp.numIdenticalPairs(nums));
    }
    public int numIdenticalPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
        }return count;
    }
}
