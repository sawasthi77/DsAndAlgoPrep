package org.example.DSImpl.Stack;

import java.util.Stack;
import java.util.Vector;

public class DeleteMidValueFromStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');

        Vector<Character> vector = new Vector<>();
        while(!st.isEmpty()){
            vector.add(st.pop());
        }

        int size = vector.size();
        if(size % 2 == 0){
            int target = size / 2;
            for(int i = 0; i < size; i++){
                if( i == target) continue;
                st.push(vector.get(i));
            }
        }
        else{
            int target = (int)Math.ceil(size /2);
            for(int i = 0; i < size; i++){
                if( i == target) continue;
                st.push(vector.get(i));
            }
        }
        System.out.println("Printing stack after deletion");
        while(!st.isEmpty()){
            char p = st.pop();
            System.out.println(p + " ");
        }
    }
}
