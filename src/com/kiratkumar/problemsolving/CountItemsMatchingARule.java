package com.kiratkumar.problemsolving;

import java.util.List;

/*
https://leetcode.com/problems/count-items-matching-a-rule/
*/
public class CountItemsMatchingARule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matchingCount = 0;

        for(List<String> item: items) {
            if(ruleKey.equalsIgnoreCase("type") && ruleValue.equalsIgnoreCase(item.get(0))) {
                matchingCount++;
            } else if(ruleKey.equalsIgnoreCase("color") && ruleValue.equalsIgnoreCase(item.get(1))) {
                matchingCount++;
            } else if(ruleKey.equalsIgnoreCase("name") && ruleValue.equalsIgnoreCase(item.get(2))) {
                matchingCount++;
            }
        }
        return matchingCount;
    }
}
