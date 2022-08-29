package com.bootcoding.basic;

import org.junit.Test;

public class MaxNumberFinderTest {
    @Test
    public void testCase1(){

        MaxNumberFinder ev=new MaxNumberFinder() ;
        int a[] = {10, 20, 40, 2, 1};
        int m=ev.findMaxElement(a);
        System.out.println(m);



    }

}
