package chapter.ch5;

import java.util.LinkedList;

public class Q4_B {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }

    private static int solveJosephusProblem(int n, int k) {

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++)  {
            queue.addLast(i);
        }

        int curPos = 0;
        while(queue.size() >= 2)    {
            curPos = (curPos + k - 1) % queue.size();
            System.out.print(queue);
            System.out.println("  (" + queue.remove(curPos) + " 제거)");

        }

        return queue.get(0);
    }
}
