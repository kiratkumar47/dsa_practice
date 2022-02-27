package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int[] nums1 = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1)));

        int[] nums2 = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));

        int[] nums3 = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] response = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int smaller = 0;
            for (int j=0; j<nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    smaller++;
                }
            }
            response[i] = smaller;
        }
        return response;
    }
}
