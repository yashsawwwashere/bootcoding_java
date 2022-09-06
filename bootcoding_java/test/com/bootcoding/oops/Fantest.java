package com.bootcoding.oops;

import org.junit.Assert;
import org.junit.Test;

public class Fantest {
    @Test
    public void test1(){
        Fan f = new Fan();
            int actualSpeed=f. regulator (2) ;

        System.out.println(actualSpeed);
    Assert.assertEquals ( 2,actualSpeed);
  }
    @Test
   public void test2(){
       Fan f = new Fan();
       int actualSpeed=f. regulator (10) ;

       System.out.println(actualSpeed);
       Assert.assertEquals ( 5,actualSpeed);
   }

  @Test
    public void test3(){
      Fan f = new Fan();
      int actualSpeed=f. regulator (-5) ;

      System.out.println(actualSpeed);
      Assert.assertEquals ( 0,actualSpeed);
    }
}
