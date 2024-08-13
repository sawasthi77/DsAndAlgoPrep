package org.example.DSImpl;

public class StackStringReversal {

    int max = 1000;
    char[] a = new char[max];
    int top;

    StackStringReversal() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(char ch){
        if( top >= (max - 1)){
            return false;
        }else{
            a[++top] = ch;
            return true;
        }
    }

    public void pop(){
        if(top < 0){
            System.out.println("No elements present to be popped");
        }else{
            System.out.println(" Element popped is: " + a[top--]);
        }
    }

    public char peek(){
        if(top < 0){
            return ' ';
        }
        else{
            return a[top];
        }
    }

    public void printStack(){
        System.out.print("Reversed String --> ");
        for(int i = top; i >= 0; i-- ){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        StackStringReversal stack = new StackStringReversal();

        String str = "swiss";
        System.out.println("Original String --> "+str);
        char[] ch = str.toCharArray();

        stack.push('s');
        stack.push('w');
        stack.push('i');
        stack.push('s');
        stack.push('s');

        stack.printStack();
    }
}
