package dev.rama27.Task.Array;

public class MissingConsecutiveNo {

    // {1,2,3,4,6,7,8,9}
    public int missingConsecutiveNo(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]-1){
                continue;
            }
            return arr[i-1]+1;

        }
        return -1;
    }
}
