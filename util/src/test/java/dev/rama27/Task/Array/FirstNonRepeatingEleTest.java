package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingEleTest {

    FirstNonRepeatingEle f=new FirstNonRepeatingEle();
    @Test
    void test(){
        int[] arr={1,1,2,3,2,4,5,3,5,6,7,8,6,8,9};
        int res=f.findFirstNonRepeatingEle(arr);
        int exp=4;
        assertEquals(exp,res);
    }

}