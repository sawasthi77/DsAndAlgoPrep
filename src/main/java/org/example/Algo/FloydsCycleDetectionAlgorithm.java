package org.example.Algo;

public class FloydsCycleDetectionAlgorithm {
    public static int findLoopLength(int[]arr, int startIndex){
        if(arr == null || arr.length == 0 || startIndex < 0 || startIndex > arr.length){
            return -1;
        }

        int slow = startIndex, fast = startIndex;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast && fast < arr.length && arr[fast] < arr.length);

        if(slow != fast)
            return -1;

        int length = 1;
        fast = arr[slow];
        while(slow != fast){
            fast = arr[fast];
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 1, 3, 1, 5};
        int startIndex = 0;
        System.out.println(findLoopLength(arr, startIndex));
    }
}
