package org.example.DSImpl.LinkedList;

public class LinkedListDeletionAtFront {
    public static Nodef removeNodeAtFront(Nodef head){
        if(head == null){
            return null;
        }
        int data = head.data;
        System.out.println("Data removed is: " + data);
        head = head.next;
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
        printList(removeNodeAtFront(head));
    }
}

class Nodef {
    int data;
    Nodef next;

    Nodef(int data){
        this.data = data;
    }
}