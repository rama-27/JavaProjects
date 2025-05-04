package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumContinuosArrTest {
    LargestSumContinuosArr l=new LargestSumContinuosArr();
    @Test
    void test(){
        int[] arr={1,-5,2,3,4,-9,6,-3,2,7,1};
        int res=l.largestSumContinuosArr(arr);
        int exp=13;
        assertEquals(exp,res);

     }

}