package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/matrix-diagonal-sum/
*/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(mat1));

        int[][] mat2 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        System.out.println(diagonalSum(mat2));

        int[][] mat3 = {{5}};
        System.out.println(diagonalSum(mat3));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int primaryIndex = 0;
        int secondaryIndexRow = 0;
        int secondaryIndexColumn = mat.length-1;

        while(primaryIndex < mat.length) {
            sum += mat[primaryIndex][primaryIndex];

            if(secondaryIndexRow != secondaryIndexColumn) {
                sum += mat[secondaryIndexRow][secondaryIndexColumn];
            }

            primaryIndex++;
            secondaryIndexRow++;
            secondaryIndexColumn--;

        }
        return sum;
    }
}
