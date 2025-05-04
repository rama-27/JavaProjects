package dev.rama27.Task.Array;

import java.util.HashMap;

public class FreqOfEachEle {
    public HashMap<Integer,Integer>  findFreqOfEachEleInArray(int[] arr){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        return freq;
    }
    
}
