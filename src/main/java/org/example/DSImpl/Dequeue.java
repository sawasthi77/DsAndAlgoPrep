package org.example.DSImpl;

import java.util.NoSuchElementException;

public class Dequeue {
    private Node front;
    private Node rear;
    private int size;

    private class Node{
        String data;
        Node next;
        Node prev;

        Node(String data){
            this.data = data;
        }
    }

    public Dequeue(){
        front = rear = null;
        size = 0;
    }

    public void addFirst(String item){
        Node newNode = new Node(item);
        if(front == null){
            front = rear = newNode;
        }
        else{
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size ++;
    }

    public void addLast(String item){
        Node newNode = new Node(item);
        if( rear == null){
            front = rear = newNode;
        }
        else{
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public String removeFirst(){
        if(front == null) throw new NoSuchElementException("Dequeue is Empty");
        String item = front.data;
        front = front.next;
        if(front != null){
            front.prev = null;
        }
        else{
            rear = null;
        }
        size --;
        return item;
    }

    public String removeLast(){
        if(rear == null) throw new NoSuchElementException("Dequeue is Empty");
        String data = rear.data;
        rear = rear.prev;
        if(rear != null){
            rear.next = null;
        }else{
            front = null;
        }
        size --;
        return data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public String peekFirst(){
        if(front == null) throw new NoSuchElementException("Dequeue is Empty");
        return front.data;
    }

    public String peekLast(){
        if(rear == null) throw new NoSuchElementException("Dequeue is Empty");
        return rear.data;
    }
}
