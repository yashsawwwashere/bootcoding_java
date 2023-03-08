package com.bootcoding.Collection.Linklist;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public Node creatLL(){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(20);
        Node n4=new Node(40);
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return head;
    }
    public void duplicateNo(Node head){
        Node temp=head;
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        while(temp!=null){
            count++;
            if(map.containsKey(temp.data)){
                map.put(temp.data, map.get(temp.data)+1);
            }
            else{
                map.put(temp.data,1);
            }
            temp=temp.next;
        }
        Node tem=head;
        int du=0;
        while(tem!=null){
            if(map.get(tem.data)>1)
            du=tem.data;
            tem=tem.next;
        }
        System.out.println(du);
        System.out.println("length of node : "+count);




    }

    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        Node head=d.creatLL();
        d.duplicateNo(head);
    }

}
