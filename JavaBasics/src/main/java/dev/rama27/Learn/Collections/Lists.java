package dev.rama27.Learn.Collections;

import java.util.*;

public class Lists {

    public static void main(String args[]){
//        iteratorEx();
//        arrayListEx();
//        linkedListEx();
//        stackEx();
    }
    public static void iteratorEx(){
        List<Integer> l= new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6));          // fyi list=List.of(1,2,3,4) makes the list immutable
        list.add(7);

        Iterator<Integer> iterator= list.iterator(); // the iterator() method return iterator object of the list
        //all collection classes had iterator() method which return iterator object
        System.out.println("elements in list are ");


        // using iterator we can modify the list safely
        while(iterator.hasNext()){
            int temp= iterator.next();
            if(temp==3){
                iterator.remove();
            }
            System.out.print(temp+" ");
        }

        System.out.println("new list after removing 3");
        Iterator<Integer> iterator1= list.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }


    }
    public static void arrayListEx(){
        List<Integer> l=new ArrayList<>(); // ArrayList
        // for ArrayList default array capcity is 10
        // ArrayList grows by 50% everytime it reaches maxCapacity limit
        l.addAll(List.of(1,2,3,4,5,6,7,8,9));
        l.add(10);
    }
    public static void linkedListEx(){
        // LinkedList implements both List interface and Deque interface
        List<Integer> list=new LinkedList<>();
        Deque<Integer> deque=new LinkedList<>();
    }
    public static void stackEx(){
        Stack<Integer> stack=new Stack<>();
        stack.push(1); // one by one
        stack.addAll(List.of(2,3,4,5)); // add all at once
        stack.pop();// removes last inserted element in this case 5
        stack.push(6); // adds 6 at top of stack
        System.out.println("top element is "+stack.peek()); // return top element at stack in this case 6

        Iterator<Integer> iterator=stack.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}
