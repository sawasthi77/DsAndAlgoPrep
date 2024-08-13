package org.example.DSImpl;

public class LinkedListDeletionAtFront {

    public static Node removeNodeAtFront(Node head){
        if(head == null){
            return null;
        }
        int data = head.data;
        System.out.println("Data removed is: " + data);
        head = head.next;
        return head;
    }

    public static void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(13);
        head.next.next = new Node(15);
        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LinkedList: ");
        printList(removeNodeAtFront(head));
    }
}
