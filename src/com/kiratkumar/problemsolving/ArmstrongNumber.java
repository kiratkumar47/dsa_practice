package com.kiratkumar.problemsolving;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int armstrongNumber = generateArmstrongNumber(number);

        System.out.println(number == armstrongNumber);
    }

    public static int generateArmstrongNumber(int number) {
        int armstrongNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            armstrongNumber += remainder * remainder * remainder;
            number /= 10;
        }
        return armstrongNumber;
    }
}
