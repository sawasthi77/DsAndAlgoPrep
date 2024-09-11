package org.example.DSImpl.Stack;

public class ReverseArrayUsingStack {
    int max = 1000;
    int[]a = new int[max];
    int top;

    ReverseArrayUsingStack(){
        top = -1;
    }

    public boolean push(int data){
        if(top >= (max - 1)){
            System.out.println("Stack overflow occurred");
            return false;
        }else{
            a[++top] = data;
            return true;
        }
    }

    public int pop(){
        if( top < 0){
            return 0;
        }else{
            return a[top --];
        }
    }

    public void printStack(){
        System.out.println("Reversed Array: ");
        System.out.print("{");
        String str = null;
        for(int i = top ; i >= 0; i--){
            str = a[i] + ",";
            System.out.print(str);
        }
        System.out.println("}");
        str.replace(",}","}");
    }

    public static void main(String[] args) {
        ReverseArrayUsingStack reverseArray = new ReverseArrayUsingStack();

        System.out.println("Original Array " + "{10,20,30,40}");

        reverseArray.push(10);
        reverseArray.push(20);
        reverseArray.push(30);
        reverseArray.push(40);

        reverseArray.printStack();
    }
}
