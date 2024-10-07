package org.example.Algo.TwoPointer;

public class ContainerWithMostWater {

    private static int maxArea(int[] height){
        int left = 0, right = height.length - 1;
        int waterTrapped = 0;

        while(left < right){
            waterTrapped = Math.max(waterTrapped, ((right - left) * Math.min(height[left], height[right])));
            if(height[left] < height[right]){
                left++;
            }else{
                right --;
            }
        }
        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
