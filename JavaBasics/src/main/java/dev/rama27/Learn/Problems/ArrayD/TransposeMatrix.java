package dev.rama27.Learn.Problems.ArrayD;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String args[]){
        int[][] matrix = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };
        sol(matrix);

//        helper();
    }
    public static void sol(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=matrix[j][i];
            }
        }
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void helper(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter square matrix side; ");
        int s=scanner.nextInt();
        int[][] matrix=new int[s][s];

        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        sol(matrix);
    }

}
