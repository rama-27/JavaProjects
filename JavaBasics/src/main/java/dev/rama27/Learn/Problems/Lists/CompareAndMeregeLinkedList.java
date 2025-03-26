package dev.rama27.Learn.Problems.Lists;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

import static dev.rama27.Learn.Problems.Lists.LinkedListDeleteMiddle.printList;
import static java.lang.System.exit;

public class CompareAndMeregeLinkedList {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
//        if(m!=n){
//            System.out.println("no");
//
//        }
            Node head=new Node(scanner.nextInt());
            Node tail=head;
            for(int i=0;i<m-1;i++){
                tail.next=new Node(scanner.nextInt());
                tail=tail.next;
            }
            printList(head);
            Node head2=new Node(scanner.nextInt());
            Node tail2=head2;
            for(int i=0;i<n-1;i++){
                tail2.next=new Node(scanner.nextInt());
                tail2=tail2.next;
            }
            printList(head2);
            if(compareLinkedList(head,head2)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            Node res=mergeTwoLinkedList(head,head2);
            printList(res);

            reverseLinkedList(res);


    }

    private static boolean compareLinkedList(Node head, Node head2) {
        while(head!=null && head2!=null){
            if(head.data!= head2.data){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;
    }
    private static Node mergeTwoLinkedList(Node head, Node head2){
        Node res;

        if(head.data<=head2.data){
            res=new Node(head.data);
            head=head.next;
        }
        else{
            res=new Node(head2.data);
            head2=head2.next;
        }
        Node result=res;

        while(head!=null && head2!=null){
            if(head.data<= head2.data){
                res.next=new Node(head.data);
                res=res.next;
                head=head.next;
            }
            else{
                res.next=new Node(head2.data);
                res=res.next;
                head2=head2.next;
            }
        }
        while(head!=null){
            res.next=new Node(head.data);
            res=res.next;
            head=head.next;
        }
        while(head2!=null){
            res.next=new Node(head2.data);
            res=res.next;
            head2=head2.next;
        }
        return result;
    }
    private static void reverseLinkedList(Node head){

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        while(head!=null){
            stack.push(head.data);
            head=head.next;
        }
//        Node reversedList=new Node(stack.pop());
        while(!stack.isEmpty()){
//            reversedList.next=new Node(stack.pop());
//            reversedList=reversedList.next;
            System.out.print(stack.pop()+" ");
        }

    }


}
