package org.example.interviewProblems;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsFromArray {

    private static int commonElement(int[] arr1, int[] arr2){
        Map<Integer, Boolean> array1Map = new HashMap<>();
        for(int i : arr1){
            array1Map.put(i, true);
        }
        for(int j : arr2){
            if(array1Map.get(j) != null) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,4,5,7};

        int commonElement = commonElement(arr1, arr2);

        if(commonElement != -1){
            System.out.println("Element found is: " + commonElement);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
