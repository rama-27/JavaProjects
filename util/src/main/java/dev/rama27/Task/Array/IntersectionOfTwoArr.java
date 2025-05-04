package dev.rama27.Task.Array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArr {
    public int[] intersetionOfTwoArr(int[] arr1,int[] arr2){
        CommonEleBtwTwoArr c=new CommonEleBtwTwoArr();
        int[] res=c.commonEleBtwTwoArr(arr1,arr2);
        Set<Integer> set=new HashSet<>();
        for(int i:res){
            set.add(i);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
