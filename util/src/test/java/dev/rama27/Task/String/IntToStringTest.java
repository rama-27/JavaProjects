package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToStringTest {
    IntToString i =new IntToString();
    @Test
    void test(){
        int num=145;
        String res=i.intToString(num);
        String exp="145";
        assertEquals(exp,res);
    }

}