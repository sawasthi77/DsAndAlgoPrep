package org.example.Arrays;

public class LeadingZeroes {
    private static int[] modify(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,0,0,1};
        for(int i : modify(array)){
            System.out.println(i);
        }
    }
}


