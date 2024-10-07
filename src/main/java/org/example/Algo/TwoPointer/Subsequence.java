package org.example.Algo.TwoPointer;

import java.util.Stack;

public class Subsequence {

    private static boolean isSubsequence(String s, String t){
        int i = s.length() - 1, j = t.length() - 1;

        if(i == j && !s.equals(t)){
            return false;
        }
        while (i >= 0 && j >= 0){
            if(s.toCharArray()[i] == t.toCharArray()[j]){
                i--;
                j--;
            }
            else{
                j--;
            }
        }
        System.out.println(i + " " + j);
        if(i >= 0 && j < 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("bb", "ahbbdc"));
    }
}
