package org.example.Arrays;

public class MinimumInRotatedArray {
    public static int findMin(int[] a) {
        int n = a.length;
        int low = 0, high = n-1;
        int mid = 0;

        while(low <= high){
            mid = (low + high) / 2;

            if(mid == 0){
                break;
            }

            if(a[mid] < a[mid - 1] && a[mid] < a[mid + 1])
            {
                return a[mid];
            }
            else if(a[mid] > a[mid -1] && a[mid] > a[mid +1]){
                return a[mid + 1];
            }
            else if(a[mid] > a[mid - 1] && a[mid] < a[mid + 1]){
                if(a[mid + 1] > a[n-1]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return a[mid];
    }

    public static void main(String[] args) {
        int a[] = {2,3,0};
        System.out.println("Minimum in Rotated array is " + findMin(a));
    }
}
