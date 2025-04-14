package dev.rama27.Hackerrank.day1.String;

import java.util.HashMap;

public class LongestSubStringWithkUniqueChars {
    public static int longestSubStringLenwithKUniqueChars(String s,int k){
        char[] arr=s.toCharArray();
        int len=arr.length;
        int maxlen=0;
        int left=0,right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<len){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            if(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;

            }
            if(map.size()<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
    public static void main(String args[]){
        System.out.println(longestSubStringLenwithKUniqueChars("aabbcacc",0));
    }
}
