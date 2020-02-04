package com.sparta.gwilymt;

public class PalindromeChecker {
    public static boolean isPalindrome(Integer number){
        Integer palindrome = PalindromeChecker.getPalindrome(number);
        if (number.equals(palindrome)){
            System.out.println(number + " is a palindrome!");
            return true;
        }
        System.out.println(number + " is not a palindrome.");
        return false;
    }
    public static Integer getPalindrome(Integer number){
        StringBuilder stringOfPalindrome = new StringBuilder(number.toString());
        stringOfPalindrome = stringOfPalindrome.reverse();
        return Integer.parseInt(stringOfPalindrome.toString());
    }
}