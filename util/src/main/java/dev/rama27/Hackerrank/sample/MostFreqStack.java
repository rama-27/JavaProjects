package dev.rama27.Hackerrank.sample;

import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;

public class MostFreqStack {
    public static void main(String[] args){

    }
}

class FreqStack{
    TreeMap<Integer,Stack<Integer>> groupMap=new TreeMap<>();
    HashMap<Integer,Integer> freqMap=new HashMap<>();

    public static void main(String[] args){
        FreqStack f=new FreqStack();
        f.push(10);
        f.push(30);
        f.push(20);
        f.push(10);
        f.push(30);
        f.pop();
    }
    public void push(int i){
        int temp;
        if(freqMap.get(i)==null){
            freqMap.put(i,1);
            temp=1;
            if(groupMap.get(temp)==null){
                groupMap.put(temp,new Stack<>());
                groupMap.get(temp).push(i);
                return;
            }
            groupMap.get(temp).push(i);
            return;
        }
        temp=freqMap.get(i)+1;
        freqMap.put(i,temp);
        groupMap.getOrDefault(temp,new Stack<>());
        groupMap.get(temp).push(i);
    }
    public void pop(){
        int last=groupMap.lastKey();
        if(!groupMap.get(last).isEmpty()){
            groupMap.get(last).pop();
            return;
        }
        groupMap.remove(last);
        last=groupMap.lastKey();
        groupMap.get(last).pop();

    }
}