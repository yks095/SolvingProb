package finalTerm.ch6;

public class Q18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        if(n<2)             // if문 잘 보기
            return n;

        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= 50; i++)	{
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[arr.length - 1];
    }
}
