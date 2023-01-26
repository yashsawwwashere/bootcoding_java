package com.bootcoding.Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        int[] nums={1,2,3,4,5,6,7,8,9};
        int right=nums.length-1;
        int left=0;
        System.out.println(bs.findBinaryNo(nums,4,left,right));

    }
    public int findBinaryNo(int[] nums,int x, int left, int right){
        int mid=(right+left)/2;
        if(x==nums[mid]){
            return mid;
        }
        if(left>=right){
            return -1;
        }

        if(x>nums[mid]) {
            return findBinaryNo(nums, x, mid + 1, right);
        }
        else{
            return findBinaryNo(nums, x, left,mid-1);
        }

    }




}
