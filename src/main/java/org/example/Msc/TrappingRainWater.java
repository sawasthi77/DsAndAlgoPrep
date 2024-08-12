package org.example.Msc;

public class TrappingRainWater {

    public static int trap(int[] height){
        if(height == null || height.length == 0){
            return 0;
        }

        int left = 0, right = height.length -1;
        int leftMax = 0, rightMax = 0, waterTrapped = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }
                else{
                    waterTrapped +=  leftMax - height[left];
                }
                left ++;
            }
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    waterTrapped += rightMax - height[right];
                }
                right --;
            }
        }
        return waterTrapped;
    }

    public static void main(String []args){
        int[] height = {3,1,1,2,0};
        System.out.println(trap(height));
    }
}
