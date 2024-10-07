package org.example.Strings;

import java.util.HashMap;

public class LargestSubstringWithKDistinctChars {
    public static int findLargestSubstringLength(String str, int k) {
        if (str == null || str.length() == 0 || k == 0) {
            return 0;
        }

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            // Shrink the window until we have at most 'k' distinct characters
            while (charFrequencyMap.size() > k) {
                char leftChar = str.charAt(left);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcdbcvf";
        int k = 3;
        int result = findLargestSubstringLength(str, k);
        System.out.println("The largest substring length with at most " + k + " distinct characters is: " + result);
    }
}
