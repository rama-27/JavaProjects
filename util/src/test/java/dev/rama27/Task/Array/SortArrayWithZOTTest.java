package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayWithZOTTest {
    SortArrayWithZOT s=new SortArrayWithZOT();
    @Test
    void test(){
        int[] arr={1,0,2,2,2,1,1,1,0,0};
        s.sortArray(arr);
        int[] exp={0,0,0,1,1,1,1,2,2,2};
        assertArrayEquals(exp,arr);
    }

}