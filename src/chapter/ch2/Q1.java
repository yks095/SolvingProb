package chapter.ch2;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(77); // list.addLast(77)와 동일
        list.add(99);
        list.add(88);
        System.out.println(list); // 리스트 내 전체 자료 출력
    }
}
