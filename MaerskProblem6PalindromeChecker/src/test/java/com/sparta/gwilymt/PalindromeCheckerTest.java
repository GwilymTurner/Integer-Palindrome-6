package com.sparta.gwilymt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {
    @Test
    void testThatThreeIsAPalindrome(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome(3));
    }
    @Test
    void testThatZeroIsAPalindrome(){Assertions.assertTrue(PalindromeChecker.isPalindrome(0));}
    @Test
    void testThatCorrectPalindromeForTwelveThousandThreeHundredAndTwentyOneIsProduced(){
        Assertions.assertEquals(12321, PalindromeChecker.getPalindrome(12321));
    }
    @Test
    void testThatCorrectPalindromeIsCreatedForNonPalindromeNumbers(){
        Assertions.assertEquals(788, PalindromeChecker.getPalindrome(887));
    }
    @Test
    void testThatTwelveThousandThreeHundredAndTwentyOneIsAPalindrome(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome(12321));
    }
    @Test
    void testThatEightHundredAndEightySevenIsNotAPalindrome(){
        Assertions.assertFalse(PalindromeChecker.isPalindrome(887));
    }
}