package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateInNPlusTest {
    DuplicateInNPlus d=new DuplicateInNPlus();

    @Test
    void test(){
        int[] arr={1,2,3,4,5,6,7,7,8,9};
        int res=d.duplicateInNPlus(arr);
        int exp=7;
        assertEquals(exp,res);
    }

}