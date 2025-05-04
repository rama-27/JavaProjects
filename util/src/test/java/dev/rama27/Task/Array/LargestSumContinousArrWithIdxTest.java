package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumContinousArrWithIdxTest {
    LargestSumContinousArrWithIdx l=new LargestSumContinousArrWithIdx();
    @Test
    void test(){
        int[] arr={1,2,-4,5,6,-20,11,7};
        int[] res=l.largestSumContinousArr(arr);
        int[] exp={11,7};
        assertArrayEquals(exp,res);

        arr=new int[]{1,2,-2,4,6,-11,3,2,3,1};
        res=l.largestSumContinousArr(arr);
        exp=new int[]{1,2,-2,4,6};
        assertArrayEquals(exp,res);
    }
}