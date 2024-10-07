package org.example.DSImpl.Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length ;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enQueue(int value){
        Node newNode = new Node(value);

        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length ++;
    }

    public Node deQueue(){
        if(length == 0) return null;
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length --;
        return temp;
    }
}
