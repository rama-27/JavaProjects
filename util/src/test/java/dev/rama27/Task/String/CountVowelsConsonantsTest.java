package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsConsonantsTest {
    CountVowelsConsonants c=new CountVowelsConsonants();

    @Test
    void test(){
        String s="apple";
        int[]res=c.countvowelsConsonants(s);
        int[] exp={2,3};
        assertArrayEquals(exp,res);

    }

}