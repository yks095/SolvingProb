package ch6;

public class Q16 {
    public static void main(String[] args) {
        System.out.println(fibo(30));
    }
    private static long fibo(int n) {
        if(n < 2)
            return n;

        return fibo(n - 2) + fibo(n - 1);
    }
}