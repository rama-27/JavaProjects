package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrSubsetTest {
    ArrSubset a=new ArrSubset();

    @Test
    void test(){
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={3,7,8,4};

        boolean res=a.isSubsetOfArr(arr1,arr2);
        boolean exp=true;
        assertEquals(res,exp);
    }

}