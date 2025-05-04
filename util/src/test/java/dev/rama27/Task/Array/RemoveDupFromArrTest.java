package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupFromArrTest {

    @Test
    void test(){
        RemoveDupFromArr r=new RemoveDupFromArr();

        int[] arr={1,6,3,1,2,5,3,6,7,3,4,5,8,7,9,6,3,2};

        int[] res=r.removeDuplicates(arr);

        int[]exp={1,2,3,4,5,6,7,8,9};
        assertEquals(res.length,exp.length);
        assertArrayEquals(exp,res);
    }

}