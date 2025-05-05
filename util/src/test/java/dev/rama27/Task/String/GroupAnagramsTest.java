package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    GroupAnagrams g=new GroupAnagrams();
    @Test
    void test(){
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res=g.groupAnagrams(anagrams);
        List<List<String>> exp=
                List.of(
                        List.of("eat","tea","ate"),
                        List.of("bat"),
                        List.of("tan","nat")
                );
        assertEquals(exp,res);
    }

}