package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvgOfArrExceptLargAndSmalTest {
    AvgOfArrExceptLargAndSmal a=new AvgOfArrExceptLargAndSmal();

    @Test
    void test(){
        int[] arr={1,3,6,8,3,2,8,4,7,9,10};
        float res= a.avg(arr);
        float exp=50.0f/9;
        assertEquals(exp,res);
    }

}