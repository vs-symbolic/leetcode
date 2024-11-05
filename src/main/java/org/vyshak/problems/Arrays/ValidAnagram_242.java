package org.vyshak.problems.Arrays;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] numOfChars = new int[26];

        // First count all characters in s
        for (char c : s.toCharArray()) {
            numOfChars[c - 'a']++;
        }

        // keep subtracts characters in t
        for (char c : t.toCharArray()) {
            numOfChars[c - 'a']--;
        }

        // if something < 0 then it needs to return false
        for (int i : numOfChars) {
            if (i != 0) return false;
        }

        return true;
    }
}
