package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
*/
public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'a'));

        char[] letters1 = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters1, 'c'));

        char[] letters2 = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters2, 'd'));

        char[] letters3 = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters3, 'j'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if(target >= letters[middle]) {
                start = middle + 1;
            } else if(target < letters[middle]) {
                end = middle - 1;
            }
        }
        return letters[start % (letters.length)];
    }

}
