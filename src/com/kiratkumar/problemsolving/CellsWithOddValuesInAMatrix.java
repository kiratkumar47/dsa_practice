package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*/
public class CellsWithOddValuesInAMatrix {

    public static void main(String[] args) {
        int[][] indices1 = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices1));

        int[][] indices2 = {{1,1},{0,0}};
        System.out.println(oddCells(2, 2, indices2));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];

        for(int i=0; i<indices.length; i++) {
            int row = indices[i][0];
            int column = indices[i][1];

            for (int j = 0; j<result[row].length; j++) {
                result[row][j] = result[row][j] + 1;
            }

            for (int j = 0; j<result.length; j++) {
                result[j][column] = result[j][column] + 1;
            }
        }

        int oddNumbersCount = 0;
        for (int row=0; row<result.length; row++) {
            for (int column=0; column<result[row].length; column++) {
                if(result[row][column] % 2 != 0) {
                    oddNumbersCount++;
                }
            }
        }

        return oddNumbersCount;
    }
}
