package dev.rama27.Task.Array;

public class AvgOfArrExceptLargAndSmal {
    public float avg(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            sum+=i;
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        sum=sum-max-min;
        return (float) sum /(arr.length-2) ;
    }
}
