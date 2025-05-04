package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairInArrSumEqTargetTest {

    @Test
    void test(){
        PairInArrSumEqTarget p=new PairInArrSumEqTarget();
        int[] arr={1,3,4,5,6,7,8,9,9};
        int target=6;
        List<List<Integer>> res= p.pairOfsumEqTarget(arr,target);

        List<List<Integer>> exp= List.of(
                List.of(1,5)
        );

        checkListEqual(exp,res);

        arr=new int[]{4,5,6,7,8,9};
        target=12;
        res=p.pairOfsumEqTarget(arr,target);
        exp=List.of(
                List.of(5,7),
                List.of(4,8)
        );

        checkListEqual(exp,res);


    }
    void checkListEqual(List<List<Integer>> res,List<List<Integer>> exp) {
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(res.get(i).get(j), exp.get(i).get(j));
            }
        }
    }
}