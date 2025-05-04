package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonEleBtwTwoArrTest {
    @Test
    void test(){
        CommonEleBtwTwoArr c=new CommonEleBtwTwoArr();

        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={6,8,9,3,2,11,43,12};
        int[] res=c.commonEleBtwTwoArr(arr1,arr2);
        int[] exp={2,3,6,8,9};
        assertArrayEquals(exp,res);

        arr1=new int[]{5,6,2,3,8,8,8,9};
        arr2=new int[]{2,2,2,3,4,6,8,8,9};

        res=c.commonEleBtwTwoArr(arr1,arr2);
        exp=new int[]{6,2,3,8,8,9};
        assertArrayEquals(exp,res);

    }

}