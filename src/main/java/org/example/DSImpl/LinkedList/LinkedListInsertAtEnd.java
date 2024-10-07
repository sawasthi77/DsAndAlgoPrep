package org.example.DSImpl.LinkedList;

public class LinkedListInsertAtEnd {
    public static Nodef insertAtEnd(Nodef head, int new_data){
        Nodef newNode = new Nodef(new_data);

        if(head == null){
            return newNode;
        }
        Nodef curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static void printList(Nodef head){
        Nodef curr = head;

        while(curr != null){
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Nodef head = new Nodef(1);
        head.next = new Nodef(2);
        head.next.next = new Nodef(3);

        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LinkedList: ");
        insertAtEnd(head, 4);
        printList(head);
    }
}
