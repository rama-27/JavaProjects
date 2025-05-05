package dev.rama27.Task.String;

import java.util.Arrays;

public class ReverseAString {
    public String reverse(String s){
        char[] chars=s.toCharArray();
        int n=chars.length;

        char temp='a';
        for(int i=0;i<n/2;i++){
            temp=chars[i];
            chars[i]=chars[n-1-i];
            chars[n-i-1]=temp;
        }
        return new String(chars);

    }

}
