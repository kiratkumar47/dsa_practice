package com.kiratkumar.problemsolving;

import java.util.Arrays;

/*
https://leetcode.com/problems/create-target-array-in-the-given-order/
*/
public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int[] nums1 = {0,1,2,3,4};
        int[] index1 = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums1, index1)));

        int[] nums2 = {1,2,3,4,0};
        int[] index2 = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums2, index2)));

        int[] nums3 = {1};
        int[] index3 = {0};
        System.out.println(Arrays.toString(createTargetArray(nums3, index3)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        int lastIndex = -1;
        for(int i=0; i<nums.length; i++) {
            if(lastIndex != -1 && lastIndex >= index[i] && lastIndex < nums.length) {
                for(int j = lastIndex +1; j>index[i]; j--) {
                    targetArray[j] = targetArray[j-1];
                }
            }
            targetArray[index[i]] = nums[i];
            lastIndex++;
        }
        return targetArray;
    }
}
