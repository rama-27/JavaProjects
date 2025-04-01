package dev.rama27.Learn.Problems.Stack;

import java.util.Stack;

public class Problems {
    public static void main(String[] args){

//        reverseStack("rama");
        

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

}
