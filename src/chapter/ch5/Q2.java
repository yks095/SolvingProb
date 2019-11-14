package chapter.ch5;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i=1; i <=5; i++) queue.add(i); // 1 2 3 4 5
        System.out.println(queue);
        int v=queue.remove(2);
        System.out.println("제거된 값="+v);
        System.out.println(queue);
    }
}
