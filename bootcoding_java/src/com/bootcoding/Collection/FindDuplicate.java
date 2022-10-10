package com.bootcoding.Collection;

import java.util.HashMap;

public class FindDuplicate {

        public int findDuplicate(int [] arr){

            HashMap<Integer,Integer> countMap=new HashMap<>();
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(countMap.containsKey(arr[i])){
                    int v=countMap.get(arr[i]);
                    countMap.put(arr[i],v+1);
                }
                else{
                    countMap.put(arr[i],1);
                }


            }
            int count=0;
            for(Integer value:countMap.values()){
                if(value>1){
                    count++;


                }
            }
            for(Integer key:countMap.keySet()){
                Integer value = countMap.get(key);
                if(value>1){
                    System.out.println("Element:" + key+ " Occurrences: " + value);
                }
            }
            return count;


        }

    public static void main(String[] args) {

        FindDuplicate f = new FindDuplicate();
          int[] a={10,22,10,22,22};
        System.out.println(f.findDuplicate(a));
        }
}
