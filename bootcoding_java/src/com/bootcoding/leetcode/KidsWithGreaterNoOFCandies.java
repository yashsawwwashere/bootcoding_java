package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterNoOFCandies {
    public static void main(String[] args) {
        KidsWithGreaterNoOFCandies kwgc=new KidsWithGreaterNoOFCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kwgc.kidsWithCandies(candies,extraCandies));

        }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        List<Boolean> list=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
                if(max<candies[i]){
                     max=candies[i];
                }

        }
        int sum=0;
        for(int i=0;i<candies.length;i++ ){
            sum=candies[i]+extraCandies;
            if(sum>=max){
                list.add(true);

            }
            else{
                list.add(false);
            }

        }
        return list;
        }
    }

