package chapter.ch2;

import java.util.LinkedList;

public class Q7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(77);
        list.add(99);
        list.add(88);
        list.remove(1);

        System.out.println(list);
    }
}
