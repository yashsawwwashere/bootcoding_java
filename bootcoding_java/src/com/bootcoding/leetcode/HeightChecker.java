package com.bootcoding.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
       int[] heights = {1,1,4,2,1,3};
       HeightChecker hc=new HeightChecker();
        System.out.println(hc.heightChecker(heights));
    }
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }return count;

    }
}
