package dev.rama27.Task.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l=new LongestConsecutiveSequence();
    @Test
    void test(){
        int[] arr={1,3,4,6,7,8,9,11,12};
        int[] res=l.longestConsecutiveSequence(arr);
        int[] exp={6,7,8,9};
        assertArrayEquals(res,exp);
    }

}