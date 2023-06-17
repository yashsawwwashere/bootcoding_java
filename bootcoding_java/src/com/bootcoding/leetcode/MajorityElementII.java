package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], c);
            }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], c + 1);
            }

        }
        int maxvalue=0;
        int maxkey=0;
        int max=0;
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums.length;j++){

        int key=nums[j];
        int count=map.get(key);
        if(maxvalue<count){
            max=count;
            maxkey=key;
        } list.add(maxkey);

    }return list;



    }
}
