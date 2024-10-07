package org.example.DSImpl.LinkedList;

public class LinkedList {

    private Nodef head;
    static void countNodes(Nodef node){
        int count = 0;
        Nodef temp = node;
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
        Nodef newNode = new Nodef(data);

        if(head == null){
            head = newNode;
        }
        else{
            Nodef current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }


}

class Node{
    Nodef next;
    int data;

    Node(int data){
        this.data = data;
        next = null;
    }
}
