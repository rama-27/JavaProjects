package dev.rama27.Task.Array;

import java.util.ArrayList;
import java.util.List;

public class AlternativePosNegNo {
    public int[] alternativePosNeg(int[] arr) {

        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i:arr){
            if(i<0)neg.add(i);
            else pos.add(i);
        }
        int[] res=new int[arr.length];
        List<Integer> r=new ArrayList<>();
        int n1=pos.size();
        int n2=neg.size();
        int i=0,j=0;
        while(i<n1 && j<n2){
            r.add(pos.get(i++));
            r.add(neg.get(j++));
        }
        while(i<n1){
            r.add(pos.get(i++));
        }
        while(j<n2){
            r.add(neg.get(j++));
        }
        res=r.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }
}
