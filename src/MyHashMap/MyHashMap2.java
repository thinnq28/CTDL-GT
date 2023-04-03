package MyHashMap;

import java.util.HashMap;

public class MyHashMap2 {
    public static void main(String[] args) {
        HashMap<Key, Integer> map = new HashMap<>();
        map.put(new Key("vishal"), 20);
//            int hash = 118
//
//            Key key = {"vishal"}
//
//            Integer value = 20

        map.put(new Key("sachin"), 30);
//        int hash = 115
//        Key key = {"sachin"}
//        Integer value = 30

        map.put(new Key("vaibhav"), 40);
//        int hash = 118
//        Key key = {"vaibhav"}
//        Integer value = 40

//        int index = key.hashcode & (n-1);
//        if(a & a)
//            if (a && a)
//        System.out.println(Integer.toBinaryString(4));
    }
}
