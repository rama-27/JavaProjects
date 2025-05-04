package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrByKPosTest {

    @Test
    void test(){
        RotateArrByKPos r=new RotateArrByKPos();
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] res=r.rotateArrByKPos(arr,5);
        int[] exp={6,7,8,9,1,2,3,4,5};

        assertArrayEquals(res,exp);

        arr=new int[]{3,6,4,2,7,9};
        res=r.rotateArrByKPos(arr,3);
        exp=new int[]{2,7,9,3,6,4};
        assertArrayEquals(exp,res);

        arr=new int[]{3,6,4,2,7,9};
        res=r.rotateArrByKPos(arr,6);
        exp=new int[]{3,6,4,2,7,9};
        assertArrayEquals(exp,res);

    }

}