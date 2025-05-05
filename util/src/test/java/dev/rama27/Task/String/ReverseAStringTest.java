package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
    ReverseAString r =new ReverseAString();
    @Test
    void test(){
        String s="Hello World";
        String res=r.reverse(s);
        String exp="dlroW olleH";
        assertEquals(exp, res);
    }

}