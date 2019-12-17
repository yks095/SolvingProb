package prof_solved.final_solved.ch6;

public class Q18 {

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        if(n<2)
            return n;

        long     m[]=new long[n+1];
        m[0]=0;
        m[1]=1;

        for (int i = 2; i <=n; i++) m[i]=m[i-2]+m[i-1];

        return m[n];
    }
}
