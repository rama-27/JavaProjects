package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestEleArrTest {
    @Test
    void test(){
        SecondLargestEleArr s=new SecondLargestEleArr();

        int[] arr={9,8,2,5,3,10,1,5};

        int ans=s.secondLargestEle(arr);
        int exp=9;
        assertEquals(exp,ans);
    }


}