package com.bootcoding.Collection.Linklist;

import java.util.List;

public class InsertElement {
    public Node creatLL(){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
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
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node firstElement(Node head,Node n) {
        n.next = head;
        head = n;

        return head;
    }
    public void lastElement(Node head,Node n){
        Node temp=head;
        while(temp.next!=null){
           {
                temp=temp.next;

            }temp.next=n;

        }
    }

    public static void main(String[] args) {
        InsertElement ie=new InsertElement();
        Node head = ie.creatLL();
        Node n=new Node(4);
        Node head2=ie.firstElement(head,n);
        ie.lastElement(head,n);
        ie.printLL(head2);

    }
//    to add midd number
    //count/2

}
