package dev.rama27.Task.Array;

import java.util.HashMap;

public class EqualityOfTwoArr {
    public boolean equlaityOfTwoArr(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int i: arr1){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(int i: arr2){
            map2.put(i, map2.getOrDefault(i,0)+1);
        }

        for(int i:arr1){
            if(map1.get(i)==map2.get(i)){
                continue;
            }
            return false;
        }
        return true;

    }
}
