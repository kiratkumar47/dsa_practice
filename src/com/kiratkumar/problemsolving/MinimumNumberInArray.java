package com.kiratkumar.problemsolving;

public class MinimumNumberInArray {

    public static void main(String[] args) {
        int[] arr = {18, 3, 6, 23, 4, 2, 23, 2};
        System.out.println(findMinimumNumberUsingLinearSearch(arr));
    }

    private static int findMinimumNumberUsingLinearSearch(int[] arr) {
        int minimumNumber = arr[0];
        for (int index = 1; index<arr.length; index++) {
            if (arr[index] < minimumNumber) {
                minimumNumber = arr[index];
            }
        }
        return minimumNumber;
    }
}
