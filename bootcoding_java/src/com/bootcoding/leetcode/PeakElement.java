package com.bootcoding.leetcode;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        PeakElement pe=new PeakElement();
        System.out.println(pe.findPeakElement(nums));
    }
        public int findPeakElement(int[] nums) {
            int temp=nums[0];
            int index=0;
            for(int i=0;i<nums.length;i++){
                if(temp<nums[i]){
                    temp=nums[i];
                    index=i;
                }
            }
            return index;
        }
    }

