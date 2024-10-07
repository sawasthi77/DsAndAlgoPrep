package org.example.DSImpl.LinkedList;

public class LinkedListDeletionAtLast {

    public static Nodef deleteAtEnd(Nodef head){
        if(head == null){
            return head;
        }

        if(head.next == null){
            return null;
        }

        Nodef pointer = head;

        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;

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
        Nodef head = new Nodef(11);
        head.next = new Nodef(13);
        head.next.next = new Nodef(15);
        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LinkedList: ");
        printList(deleteAtEnd(head));
    }
}
