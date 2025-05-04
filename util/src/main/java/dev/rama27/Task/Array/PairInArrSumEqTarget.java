package dev.rama27.Task.Array;

import java.util.*;

public class PairInArrSumEqTarget {

    public List<List<Integer>> pairOfsumEqTarget(int[] arr,int target){
        if(arr.length<2){
            return new ArrayList<>();
        }

        Set<List<Integer>> pairs=new HashSet<>();
        Set<Integer> used=new HashSet<>();

        for(int i:arr){
            int num=target-i;

            if(used.contains(num)){
                List<Integer> pair=new ArrayList<>();
                int min=Math.min(i,num);
                int max=Math.max(i,num);
                pair.add(min);
                pair.add(max);
                pairs.add(pair);
            }
            used.add(i);
        }
        return new ArrayList<>(pairs);

    }
}

