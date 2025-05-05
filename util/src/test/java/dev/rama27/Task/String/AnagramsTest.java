package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    Anagrams a =new Anagrams();

    @Test
    void test(){
        String s1="listen";
        String s2="silent";
        boolean res=a.isAnagram(s1,s2);
        boolean exp=true;
        assertEquals(exp,res);

        s1="apple";
        s2="antle";
        res=a.isAnagram(s1,s2);
        exp=false;
        assertEquals(exp,res);
    }

}