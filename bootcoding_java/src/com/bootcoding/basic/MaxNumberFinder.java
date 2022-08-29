package com.bootcoding.basic;

public class MaxNumberFinder {
    public int findMaxElement(int[] arr) {
        int[] a = {10, 20, 40, 30, 70, 50};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
            return max;





    }

}

