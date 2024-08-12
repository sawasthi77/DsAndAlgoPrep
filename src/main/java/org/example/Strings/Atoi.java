package org.example.Strings;

public class Atoi {
    // Time complexity will be O(n) where n is the length of the string.
    public static int atoi(String str){
        if(str.isEmpty()) return 0;

        int sign = 1, base = 0, i = 0;

        while(i < str.length() && str.charAt(i) == ' ') i++;

        if(i < str.length() && (str.charAt(i) == '-'|| str.charAt(i) == '+')){
            sign = str.charAt(i++) == '-' ? -1 : 1;
        }

        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            if(base > Integer.MAX_VALUE / 10 ||
                    (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)){
                return (sign == 1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }

    public static void main(String[] args) {
        System.out.println(atoi("2147483648"));
        System.out.println(atoi(" "));
        System.out.println(atoi(" hey!!"));
        System.out.println(atoi("32 43"));
        System.out.println(atoi(" 87 "));
    }
}

//1. check if the string is 0
//2. Initialize sign as positive, output as 0 and index as 0
//3. check for the leading spaces or in between spaces skip those till we get character
//4. check for the sign whether it is positive or negative integer
//5. check for the numeric characters that characters should be greater than zero and less than 9
// post that check if the base number is falling in between int range -2147483648 to 2147483647.
//Note: we use str.charAt(i) - '0' > 7 to convert the character to integer equivalent by subtracting '0'
//ASCII value, and evaluate condition with 7 to make sure max number should not exceed 2147483647.
//If we get number greater than 2147483647 then we pass it as negative number which is the edge case for this algo.
