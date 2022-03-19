package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/transpose-matrix/
*/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(matrix1)));

        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(transpose(matrix2)));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] matrixTranspose = new int[matrix[0].length][matrix.length];

        for(int row=0; row<matrix.length; row++) {
            for(int column = 0; column<matrix[row].length; column++) {
                matrixTranspose[column][row] = matrix[row][column];
            }
        }
        return matrixTranspose;
    }
}
