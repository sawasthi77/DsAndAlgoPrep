package org.example.Algo.TwoPointer;

public class PairSumIndex {

    private static int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;
        int[] output = new int[2];

        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target){
                right --;
            } else if (sum < target) {
                left ++;
            }else{
                output[0] = left + 1;
                output[1] = right + 1;
                left = right;
            }
        }
        return output;
    }


    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        for(int i : twoSum(arr, target)){
            System.out.print(i + " ");
        }
    }
}
