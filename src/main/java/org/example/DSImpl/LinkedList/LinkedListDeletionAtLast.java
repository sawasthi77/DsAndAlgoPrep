package org.example.DSImpl.LinkedList;

public class LinkedListDeletionAtLast {

    public static Node deleteAtEnd(Node head){
        if(head == null){
            return head;
        }

        if(head.next == null){
            return null;
        }

        Node pointer = head;

        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;

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
        printList(deleteAtEnd(head));
    }
}
