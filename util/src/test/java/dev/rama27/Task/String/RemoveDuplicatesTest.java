package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    RemoveDuplicates r= new RemoveDuplicates();
    @Test
    void test(){
        String s="hellooehhe";
        String res=r.removeDuplicates(s);
        String exp="helo";
        assertEquals(exp,res);
    }



}