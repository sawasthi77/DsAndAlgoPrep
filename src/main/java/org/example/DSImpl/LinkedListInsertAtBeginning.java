package org.example.DSImpl;

public class LinkedListInsertAtBeginning {

    public static Node insertAtTheBeginning(Node head, int new_data) {
        Node newNode = new Node(new_data);

        newNode.next = head;
        return newNode;
    }

    public static void printList(Node head){
        Node curr = head;

        while (curr != null) {
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.println("original linked list");
        printList(head);

        int data = 5;
        head = insertAtTheBeginning(head, data);
        System.out.println("Modified Linked List");
        printList(head);
    }
}
