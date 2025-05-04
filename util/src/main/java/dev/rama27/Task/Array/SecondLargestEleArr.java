package dev.rama27.Task.Array;

public class SecondLargestEleArr {
    public int secondLargestEle(int[] arr){
        int first,second;
        first=Integer.MIN_VALUE;
        second=first;

        for(int i:arr){
            if(i>first){
                second=first;
                first=i;

            }
            else if(i<first && i>second){
                second=i;
            }
        }
        return (second==Integer.MIN_VALUE)?-1:second;
    }


}
