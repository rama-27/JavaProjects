package dev.rama27.Learn.Problems.ArrayD;

import java.util.Scanner;

public class AlternateManner {
    public static void main(String args[]){
        int[][] matrix={
                {7,2,3},
                {2,3,4},
                {5,6,1}
        };
        sol(matrix);
        // helper();
    }
    public static void sol(int[][] matrix){
        int row= matrix.length;
        int col=matrix[0].length;

        for (int i = 0; i < row; i++) {

            if(i%2==0) {
                for (int j = 0; j < col; j++) {
                        System.out.print(matrix[i][j] + " ");
                }
            }
            else{
                for(int j=col-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    public static void helper(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter no of rows: ");
        int row= scanner.nextInt();
        System.out.println("enter no of columns: ");
        int col= scanner.nextInt();
        int[][] matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                matrix[i][j]= scanner.nextInt();
            }
        }

        sol(matrix);
    }
}
