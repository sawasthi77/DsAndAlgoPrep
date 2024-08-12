package org.example.Arrays;

public class DotProductArray {
    static int calculateDotProduct(int[] array1, int[]array2){
        if(array1.length != array2.length){
            return -1;
        }

        int dotProduct = 0;

        for(int i = 0; i < array1.length; i++){
            dotProduct += array1[i] *array2[i];
        }

        return dotProduct;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {3,4,5};
        System.out.println(calculateDotProduct(array1, array2));
    }
}
