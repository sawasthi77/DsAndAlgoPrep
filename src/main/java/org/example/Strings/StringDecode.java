package org.example.Strings;

import java.util.Stack;

public class StringDecode {

    public String decodeString(String str){
        Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            }else if(ch == ']'){
                StringBuilder decodedString = stringStack.pop();
                int count = countStack.pop();
                for(int i = 0; i < count ; i++){
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            }
            else{
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        StringDecode stringDecode = new StringDecode();
        System.out.println("Decoded String " + stringDecode.decodeString("3[a2[bc]]"));
    }
}
