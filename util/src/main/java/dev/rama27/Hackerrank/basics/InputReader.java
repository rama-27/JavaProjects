package dev.rama27.Hackerrank.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    public static void main(String[] args){
        helper();
    }

    public static void helper(){
        try(Scanner scanner=new Scanner(System.in)){
            if(scanner.hasNext()){
                int n= scanner.nextInt();
                while(n>0){
                    System.out.println(scanner.nextLine());
                    n--;
                }
            }
        }
        catch (InputMismatchException ie){
            System.out.println("mismatch error");
        }
    }
}
