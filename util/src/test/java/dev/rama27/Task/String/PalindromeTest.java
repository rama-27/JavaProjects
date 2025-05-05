package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome p=new Palindrome();
    @Test
    void test(){
        String s="madam";
        boolean res=p.isPalindrome(s);
        boolean exp=true;
        assertEquals(exp,res);

        s="apple";
        res=p.isPalindrome(s);
        exp=false;
        assertEquals(exp,res);
    }

}