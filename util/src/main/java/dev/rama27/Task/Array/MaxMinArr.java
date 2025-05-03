package dev.rama27.Task.Array;

public class MaxMinArr {
    public int[] maxMinArr(int[] arr){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        int[] res=new int[2];
        res[0]=max;
        res[1]=min;
        return res;

    }
}
