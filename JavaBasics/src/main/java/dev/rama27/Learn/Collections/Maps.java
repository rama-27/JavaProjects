package dev.rama27.Learn.Collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

//        hashMapEx();
//        treeMapEx();
        test();
    }

    public static void test(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "hundred");
        map.put(5, "five");
        map.put(20, "twenty");
        map.put(50,"fifty");

        System.out.println("HashMap ");
        for(int key: map.keySet()) {
            System.out.println("KEY: " + key + " value: " + map.get(key));
        }
        System.out.println("TREEMAP ");
        TreeMap<Integer,String > map1=new TreeMap<>();
        map1.put(100,"hundred");
        map1.put(5,"five");
        map1.put(20,"twenty");
        for(int key: map1.keySet()){
            System.out.println("KEY: "+key+"value: "+ map1.get(key));
        }

        System.out.println("LinkedHashMap");
        LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
        map2.put(100,"hundred");
        map2.put(5,"five");
        map2.put(20,"twenty");
        for(int key: map2.keySet()){
            System.out.println("KEY: "+key+"value: "+ map2.get(key));
        }

    }
    public static void hashMapEx(){
        Map<String,Integer> map=new HashMap<>();
        
        map.put( "one",1);
        map.put( "two",2);
        map.clear();// removes all items in the map
        map.put( "four",4);
        map.put( "one",1);
        map.put( "three",3);
        map.put("six",6);
        map.put( "two",2);
        map.put("five",5);

        System.out.println(map.get("three"));
        System.out.println(map.get("five"));// returns null if key doesn't exist in map
        map.put("one",11);
        System.out.println(map.get("one"));// overrides the previouse key value
        System.out.println(map.containsKey("one")+" "+map.containsValue(1));
        System.out.println(map.size());// returns size of map

        for(String key: map.keySet()){
            System.out.print(key+": "+map.get(key)+" ");
        }
        System.out.println();

        for(int val: map.values()){
            System.out.print(val+" ");
        }

        System.out.println();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.print(" Key: "+entry.getKey()+" value: "+entry.getValue());
        }

        System.out.println();
        // using iterator
        Iterator<String> keyIterator=map.keySet().iterator();
        while(keyIterator.hasNext()){
            String aKey=keyIterator.next();
            System.out.print(aKey+" "+map.get(aKey)+" ");
        }

        System.out.println();
        Iterator<Integer> valIterator=map.values().iterator();

        while(valIterator.hasNext()){
            System.out.print(valIterator.next()+" ");
        }
        System.out.println();


    }

    public static void treeMapEx(){
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3,"orange");
        map.put(2,"banana");
        map.put(1,"apple");
        System.out.print(map.firstKey()); // first inserted key
        System.out.println();
        System.out.print(map.lastKey());// last inserted key
        System.out.println();
        map.put(4,"grapes");
        System.out.print(map.lastKey());
        System.out.println();
        map.remove(4);
        System.out.print(map.lastKey());

        Iterator<Integer> keyset=map.keySet().iterator();
        while(keyset.hasNext()){
            int t= keyset.next();
            System.out.print(t+" "+map.get(t));
        }



    }
}
