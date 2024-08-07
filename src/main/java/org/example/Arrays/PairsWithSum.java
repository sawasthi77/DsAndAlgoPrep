package org.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PairsWithSum {
    public static void main(String[] args) {
        int[] array = {1,3,5,7};
        int sum = 8;
        List<int[]> pairs = findPairsWithSum(array, sum);
        for(int[] arr : pairs){
            System.out.println(arr[0] + " " + arr[1]);
        }

    }

    public static List<int[]> findPairsWithSum(int[] array, int sum){
        List<int[]> pairs = new ArrayList<>();
        for(int i = 0 ; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] + array[j] == sum){
                    pairs.add(new int[]{array[i], array[j]});
                }
            }
        }
    return pairs;
    }
}
