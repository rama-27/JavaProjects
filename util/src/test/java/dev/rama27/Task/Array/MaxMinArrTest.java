package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinArrTest {

    @Test
    void maxMinArr() {
        MaxMinArr m=new MaxMinArr();
        int[] arr={1,9,3,6,2,-6,-9,-3,11,-10};
        int[] res=m.maxMinArr(arr);
        int[] exp={11,-10};
        assertArrayEquals(exp,res);
    }
}