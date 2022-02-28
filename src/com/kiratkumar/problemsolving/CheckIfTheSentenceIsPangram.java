package com.kiratkumar.problemsolving;

/*
https://leetcode.com/problems/check-if-the-sentence-is-pangram/
*/
public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence1));


        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {
        for(char ch = 97; ch<=97+25; ch++) {
            if(!sentence.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
