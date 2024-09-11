package org.example.interviewProblems;

import java.util.*;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String [] stringArray = {"are", "ear", "ate","eat", "rea", "abc", "xyz","tee","tae"};
        List<List<String>> resultAnagrams = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();

        for(int i = 0 ; i < stringArray.length; i++){
            if(!stringArray[i].isEmpty()){
                stringSet.add(stringArray[i]);
                for(int j = i+1; j < stringArray.length; j++){
                    if(areAnagrams(stringArray[i], stringArray[j])){
                        stringSet.add(stringArray[j]);
                        stringArray[j] = "";
                    }
                }
            }
            if(!stringSet.isEmpty()){
                resultAnagrams.add(stringSet.stream().toList());
            }
            stringSet = new HashSet<>();
        }
        System.out.println(resultAnagrams);
    }
}
