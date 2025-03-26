package dev.rama27.Learn.Problems.Lists;

import java.util.Scanner;

public class LinkedListDeleteMiddle {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int testcases=scanner.nextInt();
        int len;
        while(testcases>0){
            len=scanner.nextInt();
            Node head=new Node(scanner.nextInt());
            Node tail=head;
            for(int i=0;i<len-1;i++){
                tail.next=new Node(scanner.nextInt());
                tail=tail.next;
            }
            head=deleteMid(head,len);

            printList(head);
            testcases--;
        }



    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node deleteMid(Node head, int len){
        if(head==null && head.next==null){
            return head;
        }
        Node fast =head;
        Node slow=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }


}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
