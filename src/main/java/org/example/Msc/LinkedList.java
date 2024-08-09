package org.example.Msc;

public class LinkedList {

    private Node head;
    static void countNodes(Node node){
        int count = 0;
        Node temp = node;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public LinkedList(){
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }


}

class Node{
    Node next;
    int data;

    Node(int data){
        this.data = data;
        next = null;
    }
}
