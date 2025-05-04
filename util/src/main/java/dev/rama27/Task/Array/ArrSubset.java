package dev.rama27.Task.Array;

import java.util.HashSet;

public class ArrSubset {
    public boolean isSubsetOfArr(int[] arr1,int[] arr2){
        if(arr2.length==0){
            return true;
        }
        if(arr1.length==0){
            return false;
        }

        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
