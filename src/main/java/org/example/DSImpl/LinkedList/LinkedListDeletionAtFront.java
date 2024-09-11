package org.example.DSImpl.LinkedList;

public class LinkedListDeletionAtFront {

    public static org.example.DSImpl.Node removeNodeAtFront(org.example.DSImpl.Node head){
        if(head == null){
            return null;
        }
        int data = head.data;
        System.out.println("Data removed is: " + data);
        head = head.next;
        return head;
    }

    public static void printList(org.example.DSImpl.Node head){
        org.example.DSImpl.Node curr = head;

        while(curr != null){
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        org.example.DSImpl.Node head = new org.example.DSImpl.Node(11);
        head.next = new org.example.DSImpl.Node(13);
        head.next.next = new org.example.DSImpl.Node(15);
        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LinkedList: ");
        printList(removeNodeAtFront(head));
    }
}
