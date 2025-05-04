package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArrTest {

    @Test
    void test(){
        MergeTwoSortedArr m=new MergeTwoSortedArr();

        int[] arr1={3,6,7,8,9,11,16};
        int[] arr2={1,2,4,6,8,10,12};

        int[] res=m.mergeTwoSortArr(arr1,arr2);
        int[] exp={1,2,3,4,6,6,7,8,8,9,10,11,12,16};

        assertArrayEquals(exp,res);
    }

}