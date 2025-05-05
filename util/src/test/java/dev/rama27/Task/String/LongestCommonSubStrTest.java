package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubStrTest {
    LongestCommonSubStr l=new LongestCommonSubStr();

    @Test
    void test(){
        String s1="hello world";
        String s2=" world championship";

        String res=l.longestCommonSubStr(s1,s2);
        String exp=" world";
        assertEquals(exp,res);
    }

}