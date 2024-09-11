package org.example.interviewProblems;

import java.util.*;

public class FindDuplicatesInArray {

    private static Set<Integer> getDuplicateList(int[] nums){
        Map<Integer, Integer> duplicateCountMap =
                new HashMap<>();
        Set<Integer> duplicateElements = new HashSet<>();
        int count = 1;

        for(int i : nums){
            if(duplicateCountMap.containsKey(i)){
                duplicateCountMap.put(i , duplicateCountMap.get(i) + 1);
                duplicateElements.add(i);
            }else{
                duplicateCountMap.put(i, count);
            }
        }
        return duplicateElements;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,3,1,5,8,4,5,10,8,4,1,4};
        System.out.println(getDuplicateList(arr));
    }
}
