package org.example.Arrays;

public class MaximumSubarraySum {

    public static int maximumSubArraySum(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(arr[i],currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum of array is " + maximumSubArraySum(array));
    }
}
