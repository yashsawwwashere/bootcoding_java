package com.bootcoding.leetcode;

public class SearchAndInsertion {

    public static void search(int [] num,int target){

        int n=num.length;
        boolean prt=false;
        for (int i=0;i<n;i++){

            if (num[i]==target){
                System.out.println(i);
                prt=true;
            }
            else if(target<num[i]){
                System.out.println(i);
                prt=true;
                break;
            }
        }
        if(prt==false){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        SearchAndInsertion s1= new SearchAndInsertion();
        int []num ={1,2,4,5,6};
        int target=10;
        SearchAndInsertion.search(num, target);
    }

}
