package dev.rama27.Task.Array;

import java.util.Arrays;
import java.util.HashMap;

public class CommonEleBtwTwoArr {
    public int[] commonEleBtwTwoArr(int[] arr1, int[] arr2){
        int[] common=new int[1000];
        int nums=0;
        int n1=arr1.length;
        int n2=arr2.length;

        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i:arr1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:arr2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }




        return Arrays.copyOfRange(common,0,nums);
    }
}
