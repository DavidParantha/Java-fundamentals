package test.Map;

import javax.swing.*;
import java.util.*;

public class MapExample {
    public static void main(String[] args){
        HashMap<Integer, String>map = new HashMap<>();
        map.put(341,"Amit");
        map.put(1, "Suman");
        map.put(2, "Ravi");
        map.put(3, "Amit");
        map.put(2, "Ajay");
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println(map.keySet());
//        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(0));
//        Set<Entry<Integer,String>>entries = map.entrySet();
//        for(Entry)
    }
}
//map -- values are not hashed , key are hashed,
//we should not change key
//keys are immutable
//Entry - means together in pair couple with key and value
//why set cause keys are unique
//we can have duplicate values but not keys
//hashing is applied on Keys
//Hashing ---------------> Keys
//Key --------------->Unique
//Value ---------------> Duplicate