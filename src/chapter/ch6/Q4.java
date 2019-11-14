package chapter.ch6;

public class Q4 {
    public static void main(String[] args) {
        int m=2, n=60;
        System.out.println(power(m,n));
    }
    private static long power(long m, long n) {
        if(n == 0)
            return 1;  // n == 1 로 바꿔서 풀어보기

        return m * power(m,n - 1);
    }
}
