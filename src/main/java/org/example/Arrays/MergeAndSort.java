package org.example.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeAndSort {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int[] mergedArray = mergeArrays(arr1,arr2);

        Arrays.sort(mergedArray);
        reverseArray(mergedArray);
        System.out.println("Merged array in descending order " + Arrays.toString(mergedArray));

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i : arr1){
            mergedArray[index++] = i;
        }
        for(int i : arr2){
            mergedArray[index++] = i;
        }
        return mergedArray;
    }

    public static void reverseArray(int[] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i -1] = temp;
        }
    }
}
