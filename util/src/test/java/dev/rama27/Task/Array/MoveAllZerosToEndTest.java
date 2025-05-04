package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveAllZerosToEndTest {
    MoveAllZerosToEnd m=new MoveAllZerosToEnd();

    @Test
    void test(){
        int[] arr={1,3,0,2,3,6,0,-4,2,7,0,2,4,5};
        m.moveAllZerosToEnd(arr);
        int[] exp={1,3,2,3,6,-4,2,7,2,4,5,0,0,0};
        assertArrayEquals(exp,arr);
    }

}