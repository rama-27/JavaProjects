package dev.rama27.Task.Array;

import java.util.Arrays;

public class LargestSumContinousArrWithIdx {
    public int[] largestSumContinousArr(int[] arr){

        int max=Integer.MIN_VALUE;
        int currMax=0;

        int bestStartIdx=0;
        int bestEndIdx=-1;
        int currStartIdx=0;

        for(int i=0;i<arr.length;i++){
            currMax+=arr[i];

            if(currMax>max){
                max=currMax;
                bestStartIdx=currStartIdx;
                bestEndIdx=i;
            }

            if(currMax<0){
                currMax=0;
                currStartIdx=i+1;
            }
        }

        if(bestEndIdx==-1){
            max=arr[0];
            bestStartIdx=0;
            bestEndIdx=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]> max){
                    max=arr[i];
                    bestStartIdx=i;
                    bestEndIdx=i;
                }
            }
        }

        return Arrays.copyOfRange(arr,bestStartIdx,bestEndIdx+1);
    }
}
