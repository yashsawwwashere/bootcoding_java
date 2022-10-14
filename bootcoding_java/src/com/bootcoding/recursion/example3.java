package com.bootcoding.recursion;

public class example3 {

    public void indexEvenOdd(int[] a,int index){

        int n = a.length;


        if (index>=n) {
            return ;
        }

        if(index%2 == 0){
            System.out.println(a[index]);
        }
        indexEvenOdd(a,++index);
        if(index% 2 != 0){
            System.out.println(a[index]);
        }

    }

    public static void main(String[] args) {
        example3 e1=new example3();
        int[] a={10,20,30,40,50,60};
        e1.indexEvenOdd(a,0);
    }
    }


