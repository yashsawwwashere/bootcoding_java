package com.bootcoding.leetcode;

public class ApplyOperationToArray {
    public static void main(String[] args) {
        ApplyOperationToArray aoa=new ApplyOperationToArray();
       int[] nums = {1,2,2,1,1,0};
        for (int i = 0; i <nums.length; i++) {
            System.out.println(aoa.applyOperations(nums));
        }
    }
    public int[] applyOperations(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
                i++;
            }
        }
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}