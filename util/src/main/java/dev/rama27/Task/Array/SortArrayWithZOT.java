package dev.rama27.Task.Array;

import java.util.Arrays;

public class SortArrayWithZOT {
    public void sortArray(int[] arr){
        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i:arr){
            if(i==0)zeros++;
            else if(i==1)ones++;
            else if(i==2)twos++;
        }

        Arrays.fill(arr,0,zeros,0);
        Arrays.fill(arr,zeros,zeros+ones,1);
        Arrays.fill(arr,zeros+ones,zeros+ones+twos,2);

    }
}
