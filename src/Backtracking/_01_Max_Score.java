package Backtracking;
// LeetCode Hard: 1255 - https://leetcode.com/problems/maximum-score-words-formed-by-letters/

public class _01_Max_Score {

    public static int maxScore(String[] words, int[] farr, int[] score, int idx) {

        if(idx == words.length) {
            return 0;
        }

        int sno = 0 + maxScore(words, farr, score, idx + 1);

        String word = words[idx];
        int currScore = 0;
        boolean flag = true;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(farr[ch - 'a'] == 0) flag = false;
            farr[ch - 'a']--;
            currScore += score[ch - 'a'];
        }
        int syes = 0;
        if(flag) {
            syes = currScore + maxScore(words, farr, score, idx + 1);
        }

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            farr[ch - 'a']++;
        }

        return Math.max(sno, syes);
    }


    public static void main(String[] args) {

    }
}
