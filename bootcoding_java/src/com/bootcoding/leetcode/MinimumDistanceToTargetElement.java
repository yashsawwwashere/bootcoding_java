package com.bootcoding.leetcode;

public class MinimumDistanceToTargetElement {
    public static void main(String[] args) {
        MinimumDistanceToTargetElement mdt=new MinimumDistanceToTargetElement();
       int[] nums = {1,2,3,4,5};
        int target = 5;
    int start = 3;
    }
    public int getMinDistance(int[] nums, int target, int start) {
        int res = 1000000;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                res = Math.min(res, Math.abs(i-start));
            }
        }
        return res;
    }
}

