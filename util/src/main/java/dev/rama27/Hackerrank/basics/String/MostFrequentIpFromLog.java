package dev.rama27.Hackerrank.basics.String;

import java.util.*;

public class MostFrequentIpFromLog {
    public static void main(String[] args){
        String[] input= {"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20",
                "10.0.0.3 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"};
        Map<String,Integer> map=new HashMap<>();
        for(String s:input){
            String ip= s.split(" ")[0];
            map.put(ip,map.getOrDefault(ip,0)+1);
        }
        int maxC= Collections.max(map.values());
        List<String> mostFrequentIps=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxC){
                mostFrequentIps.add(entry.getKey());
            }
        }
        Collections.sort(mostFrequentIps);
        String res= String.join(",",mostFrequentIps);
        System.out.println(res);
        String l="YOOOO";

    }
    public static void sortIntervals(){
        
    }
}
