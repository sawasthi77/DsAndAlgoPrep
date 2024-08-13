package org.example.DSImpl;

public class StackImplUsingLL {

    Node root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int new_data) {
        Node newNode = new Node(new_data);

        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {
        int data = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            data = root.data;
            root = root.next;
            return data;
        }
    }

    public int peek(){
     if(root == null){
         System.out.println("Stack is empty");
         return 0;
     }
     else{
         return root.data;
     }
    }

    public void printStack(){
        Node temp = root;
        System.out.println("Printing Stack -------->");
        while(temp != null){
            System.out.println(" " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackImplUsingLL stack = new StackImplUsingLL();
        System.out.println(stack.isEmpty());
        stack.push(15);
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.push(12);
        stack.push(15);
        System.out.println(stack.peek());
        stack.printStack();
        System.out.println(stack.peek());
    }
}
