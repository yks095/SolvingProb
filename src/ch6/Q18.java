package ch6;

public class Q18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        if(n == 1)
            return n;

        return n + fibo(n - 1);
    }
}