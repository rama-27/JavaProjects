package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicallyRotateArrByOneTest {
    CyclicallyRotateArrByOne c=new CyclicallyRotateArrByOne();

    @Test
    void test(){
        int[] arr={4,3,8,6,23,2,8,2,5,6,12,84,24,12};
        c.cyclicallyRotateArrByOne(arr);
        int[] exp={3,8,6,23,2,8,2,5,6,12,84,24,12,4};

        assertArrayEquals(exp,arr);
    }

}