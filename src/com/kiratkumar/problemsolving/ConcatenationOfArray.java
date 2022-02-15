package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/concatenation-of-array/
*/
public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums1)));

        int[] nums2 = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums2)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[(nums.length) * 2];

        for(int i=0; i<result.length; i++) {
            result[i] = nums[i%nums.length];
        }

        return result;
    }

}
