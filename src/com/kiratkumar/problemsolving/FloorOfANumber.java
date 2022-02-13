package com.kiratkumar.problemsolving;

public class FloorOfANumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16};
        int target = 15;
        System.out.println(floorOfANumber1(arr, target));
    }

    private static int floorOfANumber1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (arr[middle] <= target && (middle == arr.length -1 || arr[middle + 1] > target)) {
                return arr[middle];
            } else if(target < arr[middle]) {
                end = middle - 1;
            } else if(target > arr[middle]) {
                start = middle + 1;
            }
        }
        return Integer.MIN_VALUE;
    }

}
