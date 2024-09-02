package org.example.Mathematical;

public class PowerOfTenChecker {

    public static boolean isPowerOfTen(int num){
        if(num <= 0) return false; //non-positive and if number is zero
        while( num > 1){
            if(num % 10 != 0) return false;
            num /= 10;
        }
        return num == 1;
    }
// Loop runs until the number is reduced to 1, hence it runs for the number of digits so
    //time complexity will be log10(n)
    public static void main(String[] args) {
        System.out.println(isPowerOfTen(0));
        System.out.println(isPowerOfTen(-9));
        System.out.println(isPowerOfTen(11));
        System.out.println(isPowerOfTen(100));
        System.out.println(isPowerOfTen(1));
    }
}
