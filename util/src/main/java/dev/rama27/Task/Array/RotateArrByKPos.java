package dev.rama27.Task.Array;

public class RotateArrByKPos {

    public int[] rotateArrByKPos(int[] arr,int k){
        int n=arr.length;
        int[] res=new int[n];

        for(int i=k;i<n;i++){
            res[i-k]=arr[i];
        }

        for(int i=n-k;i<n;i++){
            res[i]=arr[i-n+k];
        }

        return res;

    }
}
