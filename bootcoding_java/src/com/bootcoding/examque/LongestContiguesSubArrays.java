package com.bootcoding.examque;

public class LongestContiguesSubArrays {
    public static void main(String[] args) {
        LongestContiguesSubArrays lc=new LongestContiguesSubArrays();
        int[] nums={12,13,1,5,4,7,8,10,10,1};
        System.out.println(lc.checkSubArray(nums));
    }
    public  int  checkSubArray(int[] arr){
        int max = 1, len = 1;
        int n=arr.length;

        for (int i=1; i<n; i++)
        {

            if (arr[i] > arr[i-1])
                len++;
            else
            {

                if (max < len)
                    max = len;


                len = 1;
            }
        }


        if (max < len)
            max = len;

   return max;
}
}
