package chapter.ch13;

import java.util.HashMap;

public class Q4_Map {
    public static void main(String[] args) {    // key, value 둘 다
        HashMap<String, Integer> hashMap=new HashMap<>();   // key, value 둘 다
        hashMap.put("Korea", 99);
        hashMap.put("Japan", 87);
        hashMap.put("China", 95);
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            System.out.println(key+"=>"+hashMap.get(key));
        }
        System.out.println(hashMap.get("China"));
        System.out.println(hashMap.get("US"));
        hashMap.remove("Japan");
        System.out.println(hashMap);
    }
}
