package com.bootcoding.oops;

public class RelativeOrderOfZeroElement {

    public static void main(String[] args) {


        int temp;

        int a[] = {0, 1, 0, 0, 3, 0, 5}; // {0,3,0,5,0} and i = 1 // 0,2,3,4 -> 2,3,4,0
        int n = a.length;
        int[] b = {0, 1, 0, 0, 3, 0, 5};
        moveZeroes(b);

        for (int i = 0; i < n; i++) {

            if(a[0] == 0){
                i = 0;
            }
            if (a[i] == 0) {
                if (i != n - 1) {
                    shiftArray(a,i);
                }
            }
        }
    }
    public static void shiftArray(int []a,int position){
        for (int i=position;i<a.length-1;i++){
//            if(a[i] != a[i+1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
//            }
        }
        printArray(a, position);
    }

    public static void moveZeroes(int[] a) {

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {

                if (j == a.length - 1) {
                    break;
                }

                if (a[j] == 0) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }

            }
        }

        for(int ii : a){

            System.out.print(ii+" ");
        }
        System.out.println(" After");

    }
    public static void printArray(int []a, int position){
        System.out.println(" index of 0 element = " + position);
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println("\n");
    }
}
