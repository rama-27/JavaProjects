package dev.rama27.Task.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TripletSum {
    public List<Integer> tripletSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j)continue;
                int num=arr[i]+arr[j];
                if(map.get(target-num)!=null){
                    res.add(arr[i]);
                    res.add(arr[j]);
                    res.add(target-num);
                    return res;
                }
            }
        }
        return res;
    }
}
