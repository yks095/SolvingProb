package prof_solved.mid_solved.ch5;

import java.util.LinkedList;

public class A4 {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue=new LinkedList<>();
        for (int i=1; i<=n; i++) queue.add(i);
        while (queue.size()>1) {
            for (int i=1; i<k; i++) queue.addLast(queue.removeFirst());
            queue.removeFirst();
        }
        return queue.removeFirst();
    }
}

