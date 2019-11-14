package chapter.ch9;

import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map=new TreeMap<>();
        map.put("Korea", 32); // <key, value>가 <"Korea", 32>인 자료 삽입
        map.put("Japan", 50);
        map.put("China", 16);
        System.out.println(map);
        map.remove("Japan"); // key 값 "Japan"에 해당하는 자료 삭제
        System.out.println(map);
        System.out.println(map.size()); // 트리 내 총 자료 개수 반환
        System.out.println(map.get("Korea")); // key 값 "Korea"에 대응되는 value 반환
        System.out.println(map.get("Germany")); // key 값 부재 시 null 반환
    }
}
