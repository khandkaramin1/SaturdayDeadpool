package com.upskill.assignment_5_3;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "abcba";
        String word2 = "abccba";
        String word3 = "hello";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
        System.out.println(word3 + " is a palindrome: " + isPalindrome(word3));
    }
}







/*The method isPalindrome(String word) takes a string as input, and iterates through the string comparing 
 * the first character with the last one, second with the second last and so on, using the charAt(i) method.
 *  If any character doesn't match it returns false, otherwise it returns true. In the main method I've created a few test strings
 *   and I've demonstrated how to use the isPalindrome method by calling it and passing the test strings as input and printing the output.*/
