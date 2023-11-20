package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {
    @Test
    public void testCheckPalindromewithPalindrome(){
        //Arrange
        String Palindrome = "level";
        //Act
        boolean result = StringPalindrome.checkPalindrome(Palindrome);

        //Assert
        assertTrue(result);
    }

    @Test
    public void testPalindromewithnonPalindrome(){
        //Arrange
        String Palindrome = "chethana";

        //Act
        boolean result = StringPalindrome.checkPalindrome(Palindrome);

        //Assert
        assertFalse(result);
    }

}