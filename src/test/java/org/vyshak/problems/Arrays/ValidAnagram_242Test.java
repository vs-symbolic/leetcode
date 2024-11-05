package org.vyshak.problems.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram_242Test {

    ValidAnagram_242 validAnagram242 = new ValidAnagram_242();

    @Test
    public void isAnagramReturnsTrue() {
        String s1 = "abcdefgh";
        String s2 = "abcdefgh";
        Assertions.assertTrue(validAnagram242.isAnagram(s1, s2));
    }

    @Test
    public void isAnagramReturnsFalse() {
        String s1 = "adcdefgh";
        String s2 = "abcdefgh";
        Assertions.assertFalse(validAnagram242.isAnagram(s1, s2));
    }
}