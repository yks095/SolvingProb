package prof_solved.final_solved.ch6;

public class Q6_A {

    public static void main(String[] args) {
        int n[]={7,2,8,4,1};
        System.out.println(sum(n, n.length-1));
    }
    private static int sum(int[] n, int i) {
        if(i < 0) return 0;
        return n[i] + sum(n, i - 1);

        // 곱일 경우
        // if(i < 0) return 1;
        // return n[i] * sum(n, i - 1);
    }

}
