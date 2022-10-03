package com.bootcoding.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={100,30,55,70,40};
        int n=arr.length;
        for (int i=1;i<n;i++){
            int x=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]<x){
                arr[j+1]=arr[j];//shift to next place
                j=j-1;

            }
            j=j+1;
            arr[j]=x;
        }

        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
