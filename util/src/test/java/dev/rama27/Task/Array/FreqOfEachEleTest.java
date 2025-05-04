package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FreqOfEachEleTest {

    @Test
    void test(){
        FreqOfEachEle f=new FreqOfEachEle();

        int[] arr={1,1,1,1,2,2,3,3,3,4,4,4,4,5,5,6,6,6,7,7,8,8,9};
        var map=f.findFreqOfEachEleInArray(arr);
        var exp=new HashMap<Integer,Integer>();
        exp.put(1,4);
        exp.put(2,2);
        exp.put(3,3);
        exp.put(4,4);
        exp.put(5,2);
        exp.put(6,3);
        exp.put(7,2);
        exp.put(8,2);
        exp.put(9,1);

        assertEquals(map,exp);

    }

}