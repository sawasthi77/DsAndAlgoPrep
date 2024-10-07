package org.example.Algo.TwoPointer;

public class PairWithMinAbsoluteValue {
    static void printClosest(int arr1[], int arr2[], int m, int n, int x){
        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
        int l = 0, r = n-1;

        while(l < m & r >= 0){
            if(Math.abs(arr1[l] + arr2[r] - x) < diff){
                res_l = l;
                res_r = r;
                diff = Math.abs(arr1[l] + arr2[r] - x);
            }

            if(arr1[l] + arr2[r] > diff){
                r--;
            }else{
                l++;
            }
        }
        System.out.println("The closest pair is " + arr1[res_l] + " " + arr2[res_r]);
    }

    public static void main(String[] args) {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        printClosest(ar1,ar2,m,n,x);
    }
}
