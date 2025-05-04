package dev.rama27.Task.Array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArr {
    public int[] unionOfTwoArr(int[] arr1,int[] arr2){
        Set<Integer> s=new HashSet<>();
        for(int i:arr1){
            s.add(i);
        }
        for(int i:arr2){
            s.add(i);
        }
        int[] res=s.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }
}
