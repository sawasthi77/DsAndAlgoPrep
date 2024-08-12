package org.example.Msc;

public class RockCollectorProblem {

    static void optimalPath(int[][] arr){
        int row = arr.length; //3
        int column = arr[0].length; //3
        int[][] dp = new int[row][column];

      dp[row -1][0] = arr[row -1][0];

      for(int j = 1; j < column; j++){
          dp[row - 1][j] =dp[row -1][j -1] + arr[row - 1][j];
        }

      for(int i = row - 2; i >= 0; i--){
          dp[i][0] = dp[i+1][0] + arr[i][0]; //(1,0) == (2,0) + (1,0)
      }

      for(int i = row - 2; i >= 0; i--){
         for(int j = 1; j < column; j++){
             dp[i][j] = Math.max(dp[i+1][j], dp[i][j -1]) + arr[i][j]; //(1,1) (2,1) or (1,0) + (1,1)
         }
      }
    }



    public static void main(String[] args) {

    }
}
