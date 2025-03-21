package dev.rama27.Learn.Collections;

import java.util.ArrayDeque;

public class ArrayDequeus {
    public static void main(String[] args){
        stackEx();
        queueEx();

    }
    public static void stackEx(){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("ele in stack  " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("remove top ele " + stack.pop());
        System.out.println(" remove  top ele" + stack.pop());
        System.out.println("ele in stack now" + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
    public static void queueEx(){
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offerLast(10);
        queue.add(40);
        queue.offerLast(20);
        queue.offerLast(30);
        System.out.println("Queue after adding 10, 20, 30: " + queue);

        System.out.println("Front element (peek): " + queue.peekFirst());

        System.out.println("Removed: " + queue.pollFirst());
        System.out.println("Removed: " + queue.pollFirst());
        System.out.println("Queue after removing twice: " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Removed: " + queue.pollFirst());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
