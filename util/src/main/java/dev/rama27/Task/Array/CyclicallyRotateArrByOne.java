package dev.rama27.Task.Array;

public class CyclicallyRotateArrByOne {
    public void cyclicallyRotateArrByOne(int[] arr){
        int l=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=l;
    }
}
