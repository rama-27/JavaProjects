package dev.rama27.Task.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] arr){
        int n=arr.length;
        if(n==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int len=0;

        for(int i:set){
            if(!set.contains(i-1)){
                int currNum=i;
                int currLen=1;
                while(set.contains(currNum+1)){
                    currNum+=1;
                    currLen+=1;
                }
                len=Math.max(len,currLen);
            }
        }
        return len;
    }
}
