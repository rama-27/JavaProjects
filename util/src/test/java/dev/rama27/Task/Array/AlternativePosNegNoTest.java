package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternativePosNegNoTest {
    AlternativePosNegNo a=new AlternativePosNegNo();
    @Test
    void test(){
        int[] arr={1,3,-1,-2,-9};
        int[]res=a.alternativePosNeg(arr);
        int[] exp={1,-1,3,-2,-9};
        assertArrayEquals(exp,res);

        arr=new int[]{1,3,2,6,7,-3,-2,-7,-5,5};

        res=a.alternativePosNeg(arr);
        exp=new int[]{1,-3,3,-2,2,-7,6,-5,7,5};
        assertArrayEquals(exp,res);


    }

}