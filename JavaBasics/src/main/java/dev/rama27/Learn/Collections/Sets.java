package dev.rama27.Learn.Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args){

//        hashSetEx();
//        linkedHashSetEx();
    }

    public static void hashSetEx(){

        // Set interface represents a collection with no duplicates
        // HashSet is an implementaion of set
        // hashSet order is not guarantee
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(3);
        hashSet.addAll(List.of(11,15,2,1,5,6,3,5));
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);

        Iterator<Integer> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.addAll(List.of("bbb","aaa","ddd","ccc"));
        hashSet1.addAll(List.of("eee","fff","ggg","hhh"));

        System.out.println();
        for(String s:hashSet1){
            System.out.print(s+" ");
        }
    }

    public static void linkedHashSetEx(){
        // linkedHashset is extended from hashset maintainig double linked list style to have indices
        // linked HashSet maintains the insertion order !!
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.addAll(List.of(1,2,5,3,2,5,4));

        Iterator<Integer> iterator=linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        Set<String> s=new LinkedHashSet<>();
        s.addAll(List.of("bbb","aaa","ddd","ccc","aa"));

        for (String str: s) {
            System.out.print(str+" " );
        }
    }

    public static void treeSetEx(){

        Set<Integer> set=new TreeSet<>();
        set.addAll(List.of(1,2,3,4));

        for (Integer i: set
             ) {
            System.out.print(i);
        }
    }
}
