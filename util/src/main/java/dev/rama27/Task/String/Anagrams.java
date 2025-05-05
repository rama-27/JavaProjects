package dev.rama27.Task.String;

import java.util.HashMap;

public class Anagrams {
    public boolean isAnagram(String s1, String s2){
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        int n1=chars1.length;
        int n2=chars2.length;
        for(char i:chars1){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(char c: chars2){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(char i:chars1){
            if(map1.get(i)!=map2.get(i)){
                return false;
            }
        }
        return true;
    }
}
