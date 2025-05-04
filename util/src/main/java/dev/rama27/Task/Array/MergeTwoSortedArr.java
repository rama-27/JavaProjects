package dev.rama27.Task.Array;

public class MergeTwoSortedArr {
    public int[] mergeTwoSortArr(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] res=new int[n1+n2];

        int i=0,j=0;
        int p=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                res[p++]=arr1[i];
                i++;
            }
            else{
                res[p++]=arr2[j];
                j++;
            }
        }
        while(i<n1){
            res[p++]=arr1[i++];
        }
        while(j<n2){
            res[p++]=arr2[j++];
        }
        return res;
    }
}
