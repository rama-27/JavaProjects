package dev.rama27.Learn.Problems.ArrayD;

import java.util.Scanner;
public class AltMatrix {
    public static void main(String args[]){

        helper();
    }
    public static void helper(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
                if((i+j)%2==0){
                    sum1+=arr[i][j];
                }
                else{
                    sum2+=arr[i][j];
                }
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
