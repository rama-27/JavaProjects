package dev.rama27.Task.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntTest {
    StringToInt s=new StringToInt();
   @Test
   void test(){
       String str="1234";
       int res=s.stringToInt(str);
       int exp=1234;
       assertEquals(exp,res);
   }

}