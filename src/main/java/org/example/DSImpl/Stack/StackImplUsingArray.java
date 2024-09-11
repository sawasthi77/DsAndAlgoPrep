package org.example.DSImpl.Stack;

public class StackImplUsingArray {
    static final int MAX = 2;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty(){
        return (top < 0);
    }

    StackImplUsingArray(){
        top = -1;
    }

    boolean push (int x){
        if(top >= (MAX-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x+ " pushed to stack");
            return true;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = a[top--];
            System.out.println(x + " returned from stack");
            return x;
        }
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = a[top];
            System.out.println(" Top element is "+x);
            return x;
        }
    }

    void print(){
        for(int i = top; i> -1; i--){
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        StackImplUsingArray stack = new StackImplUsingArray();
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.print();
    }
}
