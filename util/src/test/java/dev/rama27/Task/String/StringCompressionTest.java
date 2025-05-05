package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    StringCompression s=new StringCompression();

    @Test
    void test(){
        String st="aabbbccccdddefggg";
        char[] chars=st.toCharArray();
        char[] end=s.compress(chars);
        String res=new String(end);
        String exp="a2b3c4d3efg3";
        assertEquals(exp,res);
    }

}