package org.example.Msc;

public class Palindrome {

    public static int palindromeNumber(int num){
        int temp = num;
        int base = 0;

        while(temp > 0){
            base = 10 * base + (temp % 10);
            temp /= 10;
        }
        return base;
    }

    public static void main(String[] args) {
        System.out.println(palindromeNumber(123123456));
    }
}
