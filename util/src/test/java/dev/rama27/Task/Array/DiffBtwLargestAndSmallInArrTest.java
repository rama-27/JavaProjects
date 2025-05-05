package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiffBtwLargestAndSmallInArrTest {
    DiffBtwLargestAndSmallInArr d=new DiffBtwLargestAndSmallInArr();

    @Test
    void test(){

        int[] arr={1,3,5,6,2,7,8,3,12,4,3,7};
        int res=d.diffLarSmallInArr(arr);
        int exp=11;
        assertEquals(exp,res);


    }

}