package org.example.Algo.Sort;

public class BubbleSort {

    public static void bubbleSort(int[] myArr){
        int len = myArr.length;
        int temp = 0;
        for(int i = len - 1; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                if(myArr[j] > myArr[j + 1]){
                    temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3};
        bubbleSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
