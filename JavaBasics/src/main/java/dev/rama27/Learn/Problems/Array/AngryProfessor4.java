package dev.rama27.Learn.Problems.Array;

import java.util.Scanner;
public class AngryProfessor4 {

    public static void main(String[] args){
        helper();
    }
    public static void helper(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        sol(n,k,arr);
    }
    public static void sol(int n,int k, int[] arrival){
        int temp=0;
        for(int i: arrival){
            if(i<=0){
                temp++;
            }
        }
        if(temp>=k){
            System.out.println("NO"); // class not cancelled
        }
        else{
            System.out.println("YES");// class cancelled
        }
    }
}
