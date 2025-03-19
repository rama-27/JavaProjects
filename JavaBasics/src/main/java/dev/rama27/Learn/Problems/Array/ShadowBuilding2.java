package dev.rama27.Learn.Problems.Array;

import java.util.Scanner;

public class ShadowBuilding2 {

    public static void main(String[] args){
        sol(new int[]{1,3,5,3,2,9,7,6});// answer should be 4
//        helper();
    }
    public static void sol(int[] arr){
        int max=arr[0];// first building from left
        int idx=0;
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[idx]){
                max=arr[i];
                idx=i;
                res+=1;
            }
        }
        System.out.println(res);
    }

    public static void helper(){
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        sol(arr);
    }
}
