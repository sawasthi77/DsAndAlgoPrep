package org.example.Strings;


public class Encoding {

    static String encodingFunction(String str) {
        if (str.isBlank() || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        int count = 1;
        char currentChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) { //aaabaa
            if(str.charAt(i) == currentChar){
                count ++;
            }
            else{
                sb.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }

        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
    }
}
