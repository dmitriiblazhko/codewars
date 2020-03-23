package ru.blazhko.encode;

/**
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "("
 * if that character appears only once in the original string, or ")" if that character appears more than once
 * in the original string. Ignore capitalization when determining if a character is a duplicate.
 */

public class Main {
    public static void main(String[] args) {
        String str1 = "din";
        String str2 = "recede";
        String str3 = "Success";
        String str4 = "(( @";

        DuplicateEncoder dpEnc = new DuplicateEncoder();

        System.out.println(dpEnc.encode(str1));
        System.out.println(dpEnc.encode(str2));
        System.out.println(dpEnc.encode(str3));
        System.out.println(dpEnc.encode(str4));

    }
}
