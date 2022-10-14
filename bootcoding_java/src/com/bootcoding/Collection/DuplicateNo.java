package com.bootcoding.Collection;

public class DuplicateNo {
    public static void main(String[] args) {
        int[] d={10,20,30,30,40};
        int count=0;
        int con=0;
        for(int i=0;i<d.length;i++){

            for (int j=1;j<=i;j++){
                if(d[i]==d[j]){
                    count++;
                    con=d[j];
                }
            }
        }
        if (count>0){
            System.out.println(con);
        }


    }
}
