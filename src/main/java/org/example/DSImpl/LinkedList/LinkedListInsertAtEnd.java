package org.example.DSImpl.LinkedList;

public class LinkedListInsertAtEnd {
    public static Node insertAtEnd(Node head, int new_data){
        Node newNode = new Node(new_data);

        if(head == null){
            return newNode;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
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

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LinkedList: ");
        insertAtEnd(head, 4);
        printList(head);
    }
}
