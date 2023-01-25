package com.bootcoding.Collection;

import java.util.ArrayList;


public class ReduceNumberToZero {
    int count;
    public int coutZero(ArrayList<Integer> num ){
        int count;
        int n=num.size();
        int arr =0;
        for (int i=0;i<n;i++){

          arr =   numberOfSteps( num.get(i));

        }


        return arr;
    }


    public int numberOfSteps(int num) {

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
                if (num == 0) {
                    break;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        ReduceNumberToZero r1 = new ReduceNumberToZero();
        ArrayList<Integer>list = new ArrayList<>();


        for (int i=0;i<10;i++) {

            list.add(i*10);
        }

    }
}
