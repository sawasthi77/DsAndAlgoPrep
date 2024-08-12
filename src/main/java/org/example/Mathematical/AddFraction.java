package org.example.Mathematical;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class AddFraction {

    public static void main(String[] args) {
        int[] fraction1 = {5,10};
        int[] fraction2 = {10,100};
        int [] addedFractions = addFractions(fraction1, fraction2);
        for(int i : addedFractions){
            System.out.println(i);
        }
    }

    private static int[] addFractions(int[]fraction1, int[]fraction2){
        // [2,3], [3,4]  3*4
        int denMultiply = fraction1[1] * fraction2[1];
        int numSum = fraction1[0] * fraction2[1] + fraction2[0] * fraction1[1];
        int hcf = getHcf().apply(numSum, denMultiply);
        int[] addedFraction = {numSum/hcf, denMultiply/hcf};
        return addedFraction;
    }

    private static BiFunction<Integer, Integer, Integer> getHcf(){
        BiFunction<Integer, Integer, Integer> hcf = (a,b) ->
                IntStream.rangeClosed(1, Math.min(a,b))
                        .filter(i -> a % i == 0 && b % i == 0)
                        .max().orElse(1);
        return hcf;
    }
}


