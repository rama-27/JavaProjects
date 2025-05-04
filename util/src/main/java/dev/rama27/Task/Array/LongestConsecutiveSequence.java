package dev.rama27.Task.Array;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int[] longestConsecutiveSequence(int[] arr){
        int n=arr.length;
        int startIdx=0;
        int endIdx=0;

        int maxLen=0;
        int best_start_idx=0;
        int best_end_idx=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1){
                endIdx++;

            }
            if(endIdx-startIdx>maxLen){
                maxLen=endIdx-startIdx;
                best_start_idx=startIdx;
                best_end_idx=endIdx;
            }
            else{
                startIdx=i;
                endIdx=i;
            }


        }
        int[] res= Arrays.copyOfRange(arr,best_start_idx,best_end_idx+1);
        for(int i:res){
            System.out.println(i);
        }
        return res;
    }
}
