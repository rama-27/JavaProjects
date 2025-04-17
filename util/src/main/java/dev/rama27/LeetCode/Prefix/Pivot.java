package dev.rama27.LeetCode.Prefix;

public class Pivot {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int[] left=new int[len];
        int[] right=new int[len];
        int i=0;
        while(i<len){
            left[i]=nums[i++];
        }
        while(i>=0){
            right[i]=nums[i--];
        }
        i=0;
        int j=len-1;
        while(i<j){
            if(left[i]==right[j]){
                return i;
            }
            else{
                i++;
                j--;
            }
        }



        return -1;
    }
}
