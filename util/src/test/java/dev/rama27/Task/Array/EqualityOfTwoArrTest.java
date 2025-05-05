package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualityOfTwoArrTest {
    EqualityOfTwoArr e=new EqualityOfTwoArr();

    @Test
    void test(){
        int[] arr1={1,5,2,3,4};
        int[] arr2={3,4,2,5,1};
        boolean res=e.equlaityOfTwoArr(arr1,arr2);
        boolean exp=true;
        assertEquals(exp,res);

        arr1=new int[]{1,5,8,1,4,8};
        arr2=new int[]{5,8,4,1,8,1};
        res=e.equlaityOfTwoArr(arr1,arr2);
        exp=true;
        assertEquals(exp,res);
    }

}