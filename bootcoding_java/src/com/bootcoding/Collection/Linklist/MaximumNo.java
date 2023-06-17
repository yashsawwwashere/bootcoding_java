package com.bootcoding.Collection.Linklist;

public class MaximumNo {
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
    public void maxi(Node head){
        Node temp=head;
        Node m=head;

        while(temp!=null){
            if(temp.data>m.data){
                m=temp;
            }temp=temp.next;
        }
        System.out.println(m.data);

        }
    public void mini(Node head){
        Node temp=head;
        Node m=head;

        while(temp!=null){
            if(temp.data<m.data){
                m=temp;
            }temp=temp.next;
        }
        System.out.println(m.data);

    }

    public static void main(String[] args) {
        MaximumNo mn=new MaximumNo();
        Node head=mn.creatLL();
        mn.maxi(head);
        mn.mini(head);
    }
}
