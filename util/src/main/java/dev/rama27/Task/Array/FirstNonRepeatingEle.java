package dev.rama27.Task.Array;

import java.util.HashMap;

public class FirstNonRepeatingEle {
    public int findFirstNonRepeatingEle(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(map.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}
