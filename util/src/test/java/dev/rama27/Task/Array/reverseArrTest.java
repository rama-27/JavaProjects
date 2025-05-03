package dev.rama27.Task.Array;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class reverseArrTest {
    @Test
    public void test1(){
        int[] arr={1,2,3,4,5,6,7};
        int[] res=reverseArr.reverseArray(arr);
        int[] expected={7,6,5,4,3,2,1};

        int[] arr1={1,0,2,9,3,8,4,7,5,6};
        int[] res1=reverseArr.reverseArray(arr1);
        int[] expected1={6,5,7,4,8,3,9,2,0,1};

        assertArrayEquals(expected,res);
        assertArrayEquals(res1,expected1);

    }


}