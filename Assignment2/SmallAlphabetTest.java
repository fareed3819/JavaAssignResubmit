package Assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallAlphabetTest {
    SmallAlphabet smallAlphabet = new SmallAlphabet();

    @Test
    void TestCase1() {
        char input[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        assertTrue(smallAlphabet.checkAllAlphabetOccurrence(input));
    }

    @Test
    void TestCase2() {
        char input[] = "aBcdefghijklmnopqrstuvwxyz".toCharArray();
        assertFalse(smallAlphabet.checkAllAlphabetOccurrence(input));
    }

    @Test
    void TestCase3() {
        char input[] = "AbBCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        assertFalse(smallAlphabet.checkAllAlphabetOccurrence(input));
    }

    @Test
    void TestCase4() {
        char input[] = "AbBCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        assertTrue(smallAlphabet.checkAllAlphabetOccurrence(input));
    }

}