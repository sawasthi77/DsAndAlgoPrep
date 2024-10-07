package org.example.Algo.TwoPointer;

public class Palindrome {

    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int left = 0, right = s.length() -1;
        while (left <= right){
            char currFirst = s.charAt(left);
            char currLast = s.charAt(right);
            if(!Character.isLetterOrDigit(currFirst)){
                left++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                right --;
            }else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                left ++;
                right --;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Marge, let's \\\"[went].\\\" I await {news} telegram."));
    }
}
