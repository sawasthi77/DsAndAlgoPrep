package org.example;

public class Main {
    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        //max = sum of all elements of array
        System.out.println(largestSumInArray(arr));
    }

    public static int largestSumInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                    sum = 0;
                    break;
                }
            }
        }
        return sum;
    }
}