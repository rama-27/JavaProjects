package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionOfTwoArrTest {

    UnionOfTwoArr u=new UnionOfTwoArr();
    @Test
    void test(){
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={6,7,8,9,10,11,12,13};

        int[] res=u.unionOfTwoArr(arr1,arr2);
        int[] exp={1,2,3,4,5,6,7,8,9,10,11,12,13};
        assertArrayEquals(exp,res);
    }

}