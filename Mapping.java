package Concepts.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println("Size of map interface is: " + map.size());

        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(7));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove(2));

        System.out.println("Size of map interface is: " + map.size());
// for iterating over the whole map
        for (int key:map.keySet())
        {
            System.out.printf("Key: %s, Value: %s\n", key, map.get(key));
        }
    }
}
