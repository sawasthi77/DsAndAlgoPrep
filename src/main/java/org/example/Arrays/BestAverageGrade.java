package org.example.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestAverageGrade {

    public static int findBestAverageGrade(String[][] scores){
        Map<String, List<Integer>> studentScores = new HashMap<>();

        for(String[] scoreEntry: scores){
            String studentName = scoreEntry[0];
            int score = Integer.parseInt(scoreEntry[1]);

            studentScores.computeIfAbsent(studentName, k -> new ArrayList<>()).add(score);
        }

        int bestAvg = Integer.MIN_VALUE;

        for(Map.Entry<String, List<Integer>> entry: studentScores.entrySet()){
            List<Integer> scoreList = entry.getValue();
            int sum = 0;

            for(int score: scoreList){
                sum += score;
                System.out.println("Score " + score);
            }

            int average = sum / scoreList.size();
            bestAvg = Math.max(bestAvg, average);
        }
        return bestAvg;
    }

    public static void main(String[] args) {
        String[][] scores = {
                {"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}
        };

        System.out.println(findBestAverageGrade(scores)); // Output: 87
    }
}
