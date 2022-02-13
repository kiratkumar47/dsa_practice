package com.kiratkumar.problemsolving;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] testCase1 = {12,345,2,6,7896};
        System.out.println(findNumbers(testCase1));
        int[] testCase2 = {555,901,482,1771};
        System.out.println(findNumbers(testCase2));
    }
    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int num: nums) {
            if(isEvenNumberOfDigits2(num)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isEvenNumberOfDigits(int num) {
        String numString = String.valueOf(num);
        if(numString.length() % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEvenNumberOfDigits2(int num) {
        boolean isEven = true;
        while (num > 0) {
            num /= 10;
            if (isEven) {
                isEven = false;
            } else {
                isEven = true;
            }
        }
        return isEven;
    }
}
