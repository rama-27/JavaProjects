package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperOrLowerCaseTest {
    UpperOrLowerCase u=new UpperOrLowerCase();

    @Test
    void test(){
        String s="abCd";
        String res1=u.toLowerCase(s);
        String exp1="abcd";
        assertEquals(exp1,res1);

         s="Abcd";
        String res2=u.toUpperCase(s);
        String exp2="ABCD";
        assertEquals(exp2,res2);
    }

}