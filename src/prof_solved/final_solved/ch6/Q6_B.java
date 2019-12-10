package prof_solved.final_solved.ch6;

public class Q6_B {
    public static void main(String[] args) {
        int n[]={7,2,8,4,1};
        System.out.println(sum(n, 0));
    }
    private static int sum(int[] n, int i) {
        if(i == n.length - 1) return n[i];
        // if(i == n.length) return 0;
        return n[i] + sum(n, i + 1);
    }
}
