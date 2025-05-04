package dev.rama27.Task.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToEnd {
    public void moveAllZerosToEnd(int[] arr){
        int n=arr.length;
        List<Integer> l=new ArrayList<>();

        int c=0;
        for(int i:arr){
            if(i==0)continue;
            l.add(i);
        }
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        Arrays.fill(arr,l.size(),n,0);
    }
}
