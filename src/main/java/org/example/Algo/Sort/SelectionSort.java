package org.example.Algo.Sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int minIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
