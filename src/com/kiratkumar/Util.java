package com.kiratkumar;

import java.util.Arrays;

public class Util {

    public static void print2D(int arr[][]) {
        for (int[] row : arr) {
            System.out.print(Arrays.toString(row));
        }
        System.out.println();
    }
}
