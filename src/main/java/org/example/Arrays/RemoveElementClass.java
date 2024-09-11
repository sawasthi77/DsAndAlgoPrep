package org.example.Arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveElementClass {

    private static int removeElement(int[]nums, int val){
        int count = 0;
        for(int i : nums){
            if( i == val){
                count ++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = 1;
        System.out.println("Length of Array after removal of " + n + " is: " + removeElement(nums, 1));
        int[] output = findMaxMin(nums);
        for(int i : output){
            System.out.println(i + " ");
        }

        String[] stringList = {};
        System.out.println(findLongestString(stringList));
    }

    private static int[] findMaxMin(int[] myList){
        int max = Arrays.stream(myList).max().getAsInt();
        int min = Arrays.stream(myList).sorted().findFirst().getAsInt();
        return new int[]{max, min};
    }

    public static String findLongestString(String[] stringList){
        if(stringList.length == 0){
            return null;
        }
        return Arrays.stream(stringList)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.summingInt(String::length))).entrySet()
                .stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
    }
}
