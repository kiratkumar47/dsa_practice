package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/find-the-highest-altitude/
*/
public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int[] gain1 = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain1));

        int[] gain2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain2));
    }

    public static int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int runningSum = 0;
        for(int g: gain) {
            runningSum += g;
            if(runningSum > highestAltitude) {
                highestAltitude = runningSum;
            }
        }
        return highestAltitude;

    }
}
