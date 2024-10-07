package org.example.Algo.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairSum {
    static int isPairSum(List<Integer> integers, int n, int x) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (integers.get(i) + integers.get(j) == x) {
                return 1;
            } else if (integers.get(i) + integers.get(j) < x) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6, 5, 4, 3, 2, 1);
        int sum = 10;
        int len = arr.size();
        Collections.sort(arr);
        System.out.println(isPairSum(arr, len, sum) != 0);
    }
}
