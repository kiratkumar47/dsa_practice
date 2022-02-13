package com.kiratkumar.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {11, 9, 7, 5, 2};
        int target = 5;

        System.out.println(orderAgnosticBinarySearch(arr, target));

    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        boolean isAsc = arr[0] < arr[arr.length - 1];


        while (startIndex <= endIndex) {
            int middleIndex = findMiddleIndex1(startIndex, endIndex);
            if (target == arr[middleIndex]) {
                return middleIndex;
            } else {
                if (isAsc) {
                    if (target < arr[middleIndex]) {
                        endIndex = middleIndex - 1;
                    }  else if (target > arr[middleIndex]) {
                        startIndex = middleIndex + 1;
                    }
                } else {
                    if (target > arr[middleIndex]) {
                        endIndex = middleIndex - 1;
                    }  else if (target < arr[middleIndex]) {
                        startIndex = middleIndex + 1;
                    }
                }
            }
        }
        return -1;
    }

    private static int findMiddleIndex1(int startIndex, int endIndex) {
        return (startIndex + endIndex) / 2;
    }

    private static int findMiddleIndex2(int startIndex, int endIndex) {
        return startIndex + ((endIndex - startIndex) / 2);
    }




}
