package org.example.Algo;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void generateCombinations(List<String> result, String current, int open, int close, int max){
        if(current.length() == max * 2){
            result.add(current);
            return;
        }
        if(open < max){
            generateCombinations(result, current + "(", open + 1, close, max);
        }
        if(close < open){
            generateCombinations(result, current + ")", open, close + 1, max);
        }
    }

    public static List<String> generateParantheses(int n){
        List<String> result = new ArrayList<>();
        generateCombinations(result, "", 0, 0,n);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParantheses(n);
        System.out.println("All possible combinations are " + combinations);
    }
}
