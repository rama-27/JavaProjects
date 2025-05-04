package dev.rama27.Task.Array;

public class LargestSumContinuosArr {
    public int largestSumContinuosArr(int[] arr){
        int maxSum=arr[0];
        int currSum=0;

        for(int i:arr){
            if(currSum<0){
                currSum=0;
            }
            currSum+=i;
            maxSum=Math.max(currSum,maxSum);

        }

        return maxSum;
    }
}
