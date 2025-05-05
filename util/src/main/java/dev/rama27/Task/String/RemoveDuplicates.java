package dev.rama27.Task.String;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public String removeDuplicates(String s){
        List<Character> list=new ArrayList<>();
        char[] chars=s.toCharArray();
        for(char c:chars){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        char[] res=new char[list.size()];
        int idx=0;
        for(char c:list){
            res[idx++]=c;
        }
        return new String(res);
    }
}
