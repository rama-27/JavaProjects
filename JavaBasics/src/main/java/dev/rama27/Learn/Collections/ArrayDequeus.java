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

        System.out.println(" ele on top " + stack.peek());

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
        System.out.println("Queue ele " + queue);

        System.out.println("Front element (peek): " + queue.peekFirst());
        System.out.println("back element "+queue.peekLast());

        System.out.println("Removing front element " + queue.pollFirst());
        System.out.println("Removing back element " + queue.pollLast());
        System.out.println("Queue now  " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Removed: " + queue.pollFirst());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
