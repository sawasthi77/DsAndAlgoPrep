package org.example.Algo.Sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int temp;
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > arr[i]){
                 temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
                 i = j;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,6,6};

        insertionSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
