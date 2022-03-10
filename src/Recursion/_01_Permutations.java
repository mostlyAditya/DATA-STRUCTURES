package Recursion;

import java.util.Scanner;

public class _01_Permutations {

    // processed string and unprocessed string.
    // p is asf and up is ques
    public static void printPermutations(String p, String up) {
        if(up.length() == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String f = up.substring(0, i);
            String s = up.substring(i + 1);
            printPermutations(  p + ch, f + s);
        }
    }

    public static void main(String[] args) {

        printPermutations("", "abc");

    }

}
