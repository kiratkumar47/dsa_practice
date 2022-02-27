package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/shuffle-the-array/
*/
public class ShuffleTheArray {

    public static void main(String[] args) {
        int n1 = 3;
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums1, n1)));

        int n2 = 4;
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(shuffle(nums2, n2)));

        int n3 = 2;
        int[] nums3 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums3, n3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[nums.length];
        for (int i=0, j=0; i < n; i++) {
            shuffledNums[j++] = nums[i];
            shuffledNums[j++] = nums[i + n];
        }
        return shuffledNums;
    }
}
