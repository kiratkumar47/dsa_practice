package com.kiratkumar.problemsolving;

public class LinearSearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {7, 3, 6},
                {4, 1, 2},
                {8, 5, 9}
        };

        int target = 20;
        System.out.println(searchAnElementIn2DArrayUsingLinearSearch(arr, target));
    }

    private static boolean searchAnElementIn2DArrayUsingLinearSearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column< arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
