package dev.rama27.Task.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommonEleBtwTwoArr {
    public int[] commonEleBtwTwoArr(int[] arr1, int[] arr2){
        List<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[arr2.length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && !visited[j]){
                    res.add(arr2[j]);
                    visited[j]=true;
                    break;
                }
            }
        }

        int[] r=res.stream().mapToInt(Integer::intValue)
                .toArray();
       return r;
    }
}
