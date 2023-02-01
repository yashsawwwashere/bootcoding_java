package com.bootcoding.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FinalValueString {
    public static void main(String[] args) {
        FinalValueString fs=new FinalValueString();
        String[] operations = {"--X","X++","X++"};
        System.out.println(fs.finalValueAfterOperations(operations));


    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i <operations.length; i++) {
            if (operations[i].equals("--X")) {
                x = x - 1;
            }
            else if (operations[i].equals("++X")){
                x = x + 1;
              }
           else if (operations[i].equals("X--")){
            x = x - 1;
           }
            else if (operations[i].equals("X++")){
                x = x + 1;
          }

       }return x;

    }
}
