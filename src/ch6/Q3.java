package ch6;

public class Q3 {
    public static void main(String[] args) {
        int m=2, n=10;
        System.out.println(power(m,n));
    }
    private static long power(int m, int n) {
        long v = 1;
        for (int i = 0; i < n; i++)
            v *= m;

        return v;
    }
}
