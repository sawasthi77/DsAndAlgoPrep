package org.example.DSImpl.LinkedList;

public class LinkedListInsertAtPos {

    public static Nodef getNode(int data){
        return new Nodef(data);
    }
    public static Nodef insertAtPosition(Nodef head, int position, int new_data){
        Nodef newNode = getNode(new_data);
       if(position < 1){
           System.out.println("invalid position");
       }

       if(position == 1){
           newNode.next = head;
           head = newNode;
           return head;
       }
       else{
           while(position-- != 0){
               if(position == 1){
                   newNode.next = head.next;
                   head.next = newNode;
                   break;
               }
               head = head.next;
           }
           if(position != 1)
               System.out.println("Position out of range");
       }
       return head;
    }

    public static void printList(Nodef node){
        Nodef curr = node;

        while(curr != null){
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Nodef head = getNode(2);
        head.next = getNode(4);
        head.next.next = getNode(5);

        System.out.println("Original LinkedList: ");
        printList(head);

        System.out.println("Modified LikedList: ");
        printList(insertAtPosition(head,1,10));
    }
}
