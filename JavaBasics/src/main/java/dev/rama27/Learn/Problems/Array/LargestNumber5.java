package dev.rama27.Learn.Problems.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class LargestNumber5 {
    public static void main(String[] args){
        helper();
    }
    public static void helper(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        sol(n,arr);
    }

    public static void sol(int n, int[] arr){
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(arr[i]);
        }

        Arrays.sort(s,new Comparator<String>(){
            public int compare(String a, String b){
                String order1=a+b;
                String order2=b+a;

                return order2.compareTo(order1);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String string:s){
            sb.append(string);
        }
        System.out.println(sb.toString());

    }
}
