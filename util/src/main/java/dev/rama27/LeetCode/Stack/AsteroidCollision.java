package dev.rama27.LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids){
        int len=asteroids.length;
        int[] res=new int[len];
        int top=-1;
        for(int i: asteroids){
            if(i>0){
                res[++top]=i;
            }
            else{
                while(top!=-1 && res[top]<-i)top--;
                if(top==-1) res[++top]=i;
                else if(res[top]==-i)top--;
            }
        }

        return res;
    }

//   [-2,-2,1,-2]

}
