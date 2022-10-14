package com.bootcoding.Sorting;

public class BubbleSort {
    public static void main(String[] args) {


        int[] a = {100, 30, 70, 40, 55};
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];

                    a[i] = temp;
                }

            }
        }


        //print array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}


