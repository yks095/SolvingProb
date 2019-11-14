package chapter.ch4;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>(); // 이중연결리스트 구현

        stack.addFirst(1); // list.push(1)
        stack.addFirst(2); // list.push(2)
        stack.addFirst(3); // list.push(3)

        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택 크기 = " + stack.size());
        System.out.println("스택이 비어 있는가? " + stack.isEmpty());

        int v;

        v = stack.getFirst();
        System.out.println("스택 top 위치 자료 확인 = " + v);

        v = stack.removeFirst(); // list.pop()
        System.out.println("스택 top 위치 자료 제거 = " + v);
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택 top 위치 자료 제거 = " + stack.pop());
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택 top 위치 자료 제거 = " + stack.pop());
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택이 비어 있는가? " + stack.isEmpty());
    }
}
