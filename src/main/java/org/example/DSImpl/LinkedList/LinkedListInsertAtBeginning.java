package org.example.DSImpl.LinkedList;

public class LinkedListInsertAtBeginning {

    public static Nodef insertAtTheBeginning(Nodef head, int new_data) {
        Nodef newNode = new Nodef(new_data);

        newNode.next = head;
        return newNode;
    }

    public static void printList(Nodef head){
        Nodef curr = head;

        while (curr != null) {
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Nodef head = new Nodef(2);
        head.next = new Nodef(3);

        System.out.println("original linked list");
        printList(head);

        int data = 5;
        head = insertAtTheBeginning(head, data);
        System.out.println("Modified Linked List");
        printList(head);
    }
}
