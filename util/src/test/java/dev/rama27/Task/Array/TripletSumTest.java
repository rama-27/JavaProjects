package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletSumTest {
    TripletSum t=new TripletSum();

    @Test
    void test(){
        int[] arr={1,99,45,23,9};
        int target=33;
        List<Integer> res=t.tripletSum(arr,target);
        List<Integer> exp=List.of(1,23,9);
        assertEquals(exp,res);
    }

}