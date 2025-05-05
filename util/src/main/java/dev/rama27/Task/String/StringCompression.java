package dev.rama27.Task.String;

import java.util.Arrays;

public class StringCompression {
    public char[] compress(char[] chars) {
        int read=0;
        int start=0;
        int len=chars.length;
        while(read<len){
            int grouplen=1;
            while(read<len-1 && chars[read]==chars[read+1]){
                grouplen++;
                read++;
            }
            if(grouplen>1){
                chars[start++]=chars[read];
                char[] num=Integer.toString(grouplen).toCharArray();
                for(char c:num){
                    chars[start++]=c;
                }

            }
            else{
                chars[start++]=chars[read];
            }
            read++;
        }
        
        return Arrays.copyOfRange(chars,0,start);
    }
}
