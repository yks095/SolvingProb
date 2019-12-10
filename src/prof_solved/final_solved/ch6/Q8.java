package prof_solved.final_solved.ch6;

public class Q8 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, n.length-1));
    }
    private static int max(int[] n, int i) {
        if(i == 0) return n[i];
        int v = max(n, i - 1);
        return v < n[i] ? n[i] : v;
    }
}
