package org.example.Msc;

public class ReverseRockCollectorProblem {

    public static void main(String[] args) {
        int[][] newArr = {{0,0,5},{1,1,1},{0,0,2}};
        System.out.println(maxRockCollection(newArr));
    }

    static int maxRockCollection(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[][] dp = new int[row][col];

        dp[row - 1][col - 1] = arr[row - 1][col - 1];

        for(int i = 1; i < row; i++){
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        for(int j = 1; j < col; j++){
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }
}
