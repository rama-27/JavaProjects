package dev.rama27.Task.Array;

public class CheckArraySorted {
    public boolean isSorted(int[] arr){
        int n=arr.length;
        boolean order=arr[0]<arr[n-1];

        if(order){
            for(int i=0;i<n-1;i++){
                if(arr[i]<=arr[i+1]){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                continue;
            }
            else return false;
        }
        return true;

    }
}
