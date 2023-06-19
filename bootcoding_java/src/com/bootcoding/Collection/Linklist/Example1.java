package com.bootcoding.Collection.Linklist;

public class Example1 {
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

    public static void main(String[] args) {
        Example1 ex=new Example1();
        Node head=ex.creatLL();
        Node m=ex.creatLL();
        Node e=ex.creatLL();

        ex.printLL(head);
        System.out.println(ex.countLL(m));
        ex.evenNo(e);
    }
    public int countLL(Node m){
        Node temp=m;
        int cont=0;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
            cont++;
    }return cont;
    }
    public void evenNo(Node e){
        Node temp=e;

        while(temp!=null){
            if(temp.data%2==0){
                System.out.println(temp.data);
                temp=temp.next;

            }
        }
    }
}
