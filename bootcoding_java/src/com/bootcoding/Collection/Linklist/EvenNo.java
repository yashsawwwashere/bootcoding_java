package com.bootcoding.Collection.Linklist;

import java.util.LinkedList;
import java.util.List;

public class EvenNo {

        public Node creatLL(){
            Node n1=new Node(10);
            Node n2=new Node(20);
            Node n3=new Node(3);
            Node n4=new Node(40);
            Node head=n1;
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            return head;
        }
        public void printLL(Node head){
            Node temp=head;

            while(temp!=null){
                if(temp.data%2==0){
                    System.out.println(temp.data);
                }

                temp=temp.next;
            }
        }
    public void oddno(Node head){
        Node temp=head;

        while(temp!=null){
            if(temp.data%2!=0){
                System.out.println(temp.data);
            }

            temp=temp.next;
        }
    }

    public static void main(String[] args) {
            EvenNo en=new EvenNo();
            Node head=en.creatLL();
            en.printLL(head);
        System.out.println("odd No.");
            en.oddno(head);

    }
}


        //[1,2,1] -> [1,2,1,1,2,1]
        // INT B = new int [ a.length * 2];
        // 





