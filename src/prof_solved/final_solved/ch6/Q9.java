package prof_solved.final_solved.ch6;

public class Q9 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, 0, n.length-1));
    }
    private static int max(int[] n, int low, int high) {   // sum도 가능
        if(low == high) return n[low];

        int m = (low + high) / 2;
        int v1 = max(n, low, m);
        int v2 = max(n, m + 1, high);

        return v1 > v2 ? v1 : v2;
    }
}
