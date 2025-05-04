package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingConsecutiveNoTest {
    @Test
    void test(){
        MissingConsecutiveNo m=new MissingConsecutiveNo();
        int[] arr={1,2,3,4,6,7,8,9};
        int res=m.missingConsecutiveNo(arr);
        int exp=5;
        assertEquals(exp,res);

        arr=new int[]{0,2,3,4,5,6,7};
        res=m.missingConsecutiveNo(arr);
        exp=1;
        assertEquals(exp,res);
        arr=new int[]{0,1,2,3,4,5,6,8};
        res=m.missingConsecutiveNo(arr);
        exp=7;
        assertEquals(exp,res);
    }

}