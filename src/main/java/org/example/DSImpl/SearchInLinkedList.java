package org.example.DSImpl;

public class SearchInLinkedList {
    public static boolean search(Node head, int key){
        if(head == null){
            System.out.println("No element present in the list");
            return false;
        }
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Found key "+ key + " in the list at position: " + count);
                break;
            }
            count++;
            temp = temp.next;
        }
        if(temp == null){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(91);
        head.next.next = new Node(93);
        head.next.next.next = new Node(00);
        head.next.next.next.next = new Node(1);

        System.out.println(search(head,00));
    }
}
