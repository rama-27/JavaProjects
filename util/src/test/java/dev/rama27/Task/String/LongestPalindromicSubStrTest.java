package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubStrTest {
    LongestPalindromicSubStr l= new LongestPalindromicSubStr();

    @Test
    void test(){
        String s="racecar is ";
        String res=l.longestPalindrome(s);
        String exp="racecar";
        assertEquals(exp,res);
    }

}