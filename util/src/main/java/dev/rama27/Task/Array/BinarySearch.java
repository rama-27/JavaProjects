package dev.rama27.Task.Array;

public class BinarySearch {
    public int binarySearch(int[] arr,int target){
        int n=arr.length;

        int low=0;
        int high=n-1;

        int mid;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }


        return -1;
    }
}
