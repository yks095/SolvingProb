package ch2;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
