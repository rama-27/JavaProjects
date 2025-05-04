package dev.rama27.Task.Array;

import java.util.*;

public class RemoveDupFromArr {
    public int[] removeDuplicates(int[] arr){
        HashSet<Integer> set=new HashSet<>();

        for(int i:arr){
            set.add(i);
        }

        int[] res=new int[set.size()];

        int idx=0;
        for(int i: set){
            res[idx++]=i;
        }

        return res;


    }
}
