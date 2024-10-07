package org.example.Arrays;

import java.util.Arrays;

public class MinimumSizeSubArray {

    private static int sizeSubArray(int[] nums, int target){
        int last = nums.length - 1;
        int prev = last - 1;
        int sum = 0, count = 0;
        Arrays.sort(nums);
        while (prev >= 0){
            for(int i = (last - count) ; i >= prev; i--) {
                count++;
                sum += nums[i];
                if (sum == target) {
                    return count;
                }
                if(sum > target) {
                    sum -= nums[i];
                    last--;
                    count--;
                }
            }
            prev--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2,16,14,15};//<2,14,15,16>
        int targetSum = 20;
        System.out.println(sizeSubArray(arr,targetSum));
    }
}
