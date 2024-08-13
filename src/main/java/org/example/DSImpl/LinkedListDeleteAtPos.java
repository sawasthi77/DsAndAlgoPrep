package org.example.DSImpl;

public class LinkedListDeleteAtPos {

    public static Node deleteAtPosition(Node head, int position){
        if(position < 1){
            System.out.println("Invalid position");
        }

        if(position == 1){
            head = head.next;
            return head;
        }

       Node temp = head;
        Node prev = null;

        for(int i = 0; temp != null && i < position; i++){
            prev = temp;
            temp = temp.next;
        }

        if(temp != null){
            prev.next = temp.next;
        }else{
            System.out.println("Data not present");
        }
        return head;
}
}