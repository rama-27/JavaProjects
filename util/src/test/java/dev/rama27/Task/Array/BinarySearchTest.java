package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test(){
        BinarySearch b=new BinarySearch();
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int target=3;
        int res=b.binarySearch(arr,target);
        int exp=3;
        assertEquals(exp,res);

        arr=new int[]{3,6,11,33,39,42,48,49,58,60,69,73,79,82,88,90,95,99};
        target=72;
        res=b.binarySearch(arr,target);
        exp=-1;
        assertEquals(exp,res);


        arr=new int[]{3,6,11,33,39,42,48,49,58,60,69,73,79,82,88,90,95,99};
        target=82;
        res=b.binarySearch(arr,target);
        exp=13;
        assertEquals(exp,res);


    }

}