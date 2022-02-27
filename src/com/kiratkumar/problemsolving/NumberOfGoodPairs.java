package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/number-of-good-pairs/
*/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3));
    }

    public static int numIdenticalPairs(int[] nums) {
        int identicalPairs = 0;
        for (int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    identicalPairs++;
                }
            }
        }
        return identicalPairs;
    }
}
