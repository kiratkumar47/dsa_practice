package com.kiratkumar.problemsolving;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int extraCandies1 = 3;
        int[] candies1 = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies1, extraCandies1));

        int extraCandies2 = 1;
        int[] candies2 = {4, 2, 1, 1, 2};
        System.out.println(kidsWithCandies(candies2, extraCandies2));

        int extraCandies3 = 10;
        int[] candies3 = {12, 1, 12};
        System.out.println(kidsWithCandies(candies3, extraCandies3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for (int candy: candies) {
            if (candy > greatestCandies) {
                greatestCandies = candy;
            }
        }
        List<Boolean> response = new ArrayList<>();
        for(int candy: candies) {
            if (candy + extraCandies >= greatestCandies) {
                response.add(Boolean.TRUE);
            } else {
                response.add(Boolean.FALSE);
            }
        }

        return response;
    }
}
