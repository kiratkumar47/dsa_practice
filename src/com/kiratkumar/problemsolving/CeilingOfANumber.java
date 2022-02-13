package com.kiratkumar.problemsolving;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16};
        int target = 150;
        System.out.println(ceilingOfANumber1(arr, target));
    }

    private static int ceilingOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (arr[middle] >= target && (middle == 0 || arr[middle - 1] < target)) {
                return arr[middle];
            } else if (arr[middle] < target) {
                start = middle + 1;
            }  else if (arr[middle] > target) {
                end = middle - 1;
            }
        }

        return Integer.MAX_VALUE;
    }

    private static int ceilingOfANumber1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (arr[middle] == target) {
                return arr[middle];
            } else if (arr[middle] < target) {
                start = middle + 1;
            }  else if (arr[middle] > target) {
                end = middle - 1;
            }
        }

        return arr[start];
    }
}
