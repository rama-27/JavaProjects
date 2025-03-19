package dev.rama27.Learn.Problems.Array;

import java.util.Scanner;

public class SecondLargest3 {

    public static void main(String[] args){
        sol(new int[]{67,23,88,33,11,34,253});

//        helper();
    }
    public static  void sol(int[] arr){
        int largest=Integer.MIN_VALUE,secondLargest=largest;
        largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    public static void helper(){
        Scanner scanner= new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }

        sol(arr);
    }

}
