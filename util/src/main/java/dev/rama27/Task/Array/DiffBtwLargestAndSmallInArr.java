package dev.rama27.Task.Array;

public class DiffBtwLargestAndSmallInArr {
    public int diffLarSmallInArr(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        return Math.abs(max-min);
    }
}
