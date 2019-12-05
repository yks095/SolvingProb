package chapter.ch13;

import java.util.HashSet;

public class Q4_Set {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();        // key 만
        hashSet.add("Korea");
        hashSet.add("Japan");
        hashSet.add("China");
        System.out.println(hashSet);
        for (String key : hashSet) {
            System.out.println(key);
        }
        System.out.println(hashSet.contains("China"));
        System.out.println(hashSet.contains("US"));
        hashSet.remove("Japan");
        System.out.println(hashSet);
    }
}
