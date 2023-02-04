package com.bootcoding.leetcode;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] arr) {

        int temp=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
                index=i;
            }
        }
        return index;
    }
}

