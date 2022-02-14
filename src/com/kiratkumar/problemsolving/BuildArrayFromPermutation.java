package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/build-array-from-permutation/
*/
public class BuildArrayFromPermutation {

    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArrayFromPermutation(nums)));

        int[] nums1 = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArrayFromPermutation(nums1)));
    }

    public static int[] buildArrayFromPermutation(int[] nums) {
        int[] response = new int[nums.length];

        for(int index = 0; index <= response.length - 1; index++) {
            response[index] = nums[nums[index]];
        }
        return response;
    }

}
