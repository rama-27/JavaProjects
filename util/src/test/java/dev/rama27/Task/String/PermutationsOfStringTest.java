package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsOfStringTest {
    PermutationsOfString p=new PermutationsOfString();
    @Test
    void test(){
        String s="abcd";
        List<String> res=p.generatePermutations(s);
        List<String> exp=List.of(
               "acbd", "adbc", "bcad", "bdac", "cbad", "cdab", "abdc",
               "acdb", "bacd", "bdca", "cabd", "cdba", "dbac", "dcab", "abcd", "adcb",
               "badc", "bcda", "dcba", "dabc", "cbda", "cadb", "dbca", "dacb"
        );
        assertEquals(res,exp);
    }

}