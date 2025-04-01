package dev.rama27.Learn.Problems.Stack;

import java.util.Stack;

public class Problems {
    public static void main(String[] args){

//        reverseStack("rama");

//        checkValidParanthesis("(((****)");

    }

    public static void reverseStack(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.add(s.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"");
        }
        System.out.println();

    }

    public static boolean checkValidParanthesis(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else if (c == '*') {
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0) {
                return false;
            }

            minOpen = Math.max(0, minOpen);
        }

        System.out.println(minOpen==0);
        return minOpen == 0;
    }
}
