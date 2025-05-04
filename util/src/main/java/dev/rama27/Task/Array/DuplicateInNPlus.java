package dev.rama27.Task.Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInNPlus {
    public int duplicateInNPlus(int[] arr){

        Set<Integer> set=new HashSet<>();

        for(int i:arr){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }


        return -1;
    }
}
