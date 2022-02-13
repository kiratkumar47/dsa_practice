package com.kiratkumar.algorithm;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1, 3,6, 2, 12, 4, 12, 41, 135, 327, 24,7352, 436};

        System.out.println(linearSearch(array, 22));
    }

    private static boolean linearSearch(int[] array, int search) {
        for (int element: array) {
            if (element == search) return true;
        }
        return false;
    }
}
