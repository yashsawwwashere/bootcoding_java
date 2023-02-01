package com.bootcoding;

public class ArrayRelativeOrderZeroElement {

        int a[]={10,10,30,0,20};

        public void moveZeroes(){

            for (int i=0;i<a.length;i++){
                if(a[i]==0){
                    a[i+1]=a[i];
                    a[i]=a[i+1];
                }
                System.out.println(a[i]);
            }
        }

    public static void main(String[] args) {
        ArrayRelativeOrderZeroElement a1 = new ArrayRelativeOrderZeroElement();
        a1.moveZeroes();
    }
}
