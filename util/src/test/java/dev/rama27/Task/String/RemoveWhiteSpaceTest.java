package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveWhiteSpaceTest {
    RemoveWhiteSpace r=new RemoveWhiteSpace();

    @Test
    void test(){
        String s="  spider ";
        String res=r.removeWhitespace(s);
        String exp="spider";
        assertEquals(exp,res);
    }

}