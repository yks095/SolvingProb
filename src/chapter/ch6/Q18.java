package chapter.ch6;

public class Q18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= arr.length - 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}