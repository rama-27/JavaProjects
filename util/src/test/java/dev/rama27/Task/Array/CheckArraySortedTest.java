package dev.rama27.Task.Array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArraySortedTest {


    @Test
    void isSorted() {
        CheckArraySorted c=new CheckArraySorted();
        int[] arr={1,2,3,4,7,8,9};
        boolean res=c.isSorted(arr);
        boolean exp=true;
        assertEquals(exp,res);

        arr=new int[]{1,6,9,10,12,11};
        res=c.isSorted(arr);
        exp=false;
        assertEquals(exp,res);

        arr=new int[]{1,9,10,12,111,203,304,405,405};
        res=c.isSorted(arr);
        exp=true;
        assertEquals(exp,res);

        arr=new int[]{99,80,50,30,28,28,19,19,11};
        res=c.isSorted(arr);
        exp=true;
        assertEquals(exp,res);

    }
}