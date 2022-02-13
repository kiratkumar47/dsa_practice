package com.kiratkumar.problemsolving;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 123456789;

        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        System.out.println(reverseNumber);
    }
}
