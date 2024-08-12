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

    public static class BST {

        class TreeNode{
            int value;
            TreeNode left;
            TreeNode right;

            TreeNode(int value){
                this.value = value;
            }
        }

        private TreeNode root;
        public void put(int value){
            root = put(root, value);
        }
        private TreeNode put(TreeNode node, int value){
            if(node == null){
                return new TreeNode(value);
            }
            if(value < node.value){
                node.left = put(node.left, value);
            }
            else if(value > node.value){
                node.right = put(node.right, value);
            }
            return node;
        }

        public boolean contains(int value){
            return contains(root, value);
        }

        private boolean contains(TreeNode node, int value){
            if(node == null){
                return false;
            }
            if(value == node.value){
                return true;
            }
            return value < node.value ? contains(node.left, value) : contains(node.right, value);
        }

        public void inOrderTraversal(){
            inOrderTraversal(root);
        }

        private void inOrderTraversal(TreeNode node){
            if(node!=null){
                inOrderTraversal(node.left);
                System.out.println(node.value + " ");
                inOrderTraversal(node.right);
            }
        }

        public static void main(String[] args) {
            BST bst = new BST();
            bst.put(5);
            bst.put(3);
            bst.put(7);
            bst.put(2);
            bst.put(4);
            bst.put(6);
            bst.put(8);

            System.out.println("Contains 4: " + bst.contains(4));
            System.out.println("Contains 9: " + bst.contains(9));

            System.out.println("Inorder Traversal: ");
            bst.inOrderTraversal();
        }
    }
}
