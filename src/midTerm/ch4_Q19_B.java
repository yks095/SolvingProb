package midTerm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ch4_Q19_B {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }

    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++)	{
            queue.addLast(i);
        }

        int curPos = 0;

        while(queue.size() >= 2)	{
            System.out.println(queue);
            curPos = (curPos + k - 1) % queue.size();
            queue.remove(curPos);
        }
        return queue.removeFirst();
    }
}