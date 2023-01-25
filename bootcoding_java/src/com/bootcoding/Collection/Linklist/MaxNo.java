package com.bootcoding.Collection.Linklist;

import java.util.LinkedList;
import java.util.List;

//public class MaxNo {
//    public static void main(String[] args) {
//        List<Integer> list=new LinkedList<Integer>();
//        int[] a={2,3,4,5,6,7,8,};
//        for(int i=0;i<a.length;i++){
//            list.add(a[i]);}
//        for(Integer in:list){
//            if()
//        }
//    }
//}

public class MaxNo {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printMxnmumElements(head);
    }
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printMxnmumElements(Node head) {
        Node temp = head;//5,10,2
        int min = head.data;//5,2
        while (temp != null) {
            if (temp.data > min ) {
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println(min);
    }
    private static Node createLinkedList() {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }
}
