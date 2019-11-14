package chapter.ch5;

import java.util.LinkedList;

public class Q4_A {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }

    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++)  {
            queue.addLast(i);
        }

        while (queue.size() >= 2)   {
            System.out.print(queue);
            removeNum(queue, k);
        }

        return queue.get(0);
    }

    private static LinkedList<Integer> removeNum(LinkedList<Integer> queue, int k) {
        for(int i = 1; i < k; i++) {
            queue.addLast(queue.removeFirst());
        }
        System.out.println("  (" + queue.removeFirst() + " 제거)");
        return queue;
    }
}
