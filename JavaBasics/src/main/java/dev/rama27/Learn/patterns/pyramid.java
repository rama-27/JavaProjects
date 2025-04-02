package dev.rama27.Learn.patterns;

import java.util.Scanner;

public class pyramid {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int space=a;
        int star=1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("*"+" ");
            }
            space--;
            star++;
            System.out.println();
        }

    }
}
