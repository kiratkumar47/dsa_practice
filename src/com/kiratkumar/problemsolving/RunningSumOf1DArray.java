package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/running-sum-of-1d-array/
*/
public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        System.out.println(Arrays.toString(runningSumOptimized(nums1)));

        int[] nums2 = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSumOptimized(nums2)));

        int[] nums3 = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSumOptimized(nums3)));
    }

    public static int[] runningSum(int[] nums) {
        int sum =0;
        int runningSum[] = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    public static int[] runningSumOptimized(int[] nums) {
        int sum =0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
