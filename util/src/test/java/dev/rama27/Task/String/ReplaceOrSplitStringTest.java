package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceOrSplitStringTest {
    ReplaceOrSplitString r=new ReplaceOrSplitString();

    @Test
    void test(){
        String s="abcdefg";
        String res=r.replaceSubstring(s,"def","DEF");
        String exp="abcDEFg";
        assertEquals(exp,res);

        String[] res1=r.splitString(s,"c");

        String[] exp1={"ab","defg"};
        assertArrayEquals(exp1,res1);
    }

}