package ch1;

import java.util.Arrays;
import java.util.Random;

public class Q19 {
    public static void main(String[] args) {
        int N = 20, M = 10;
        int n[] = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++)
            n[i] = random.nextInt(M);

        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}
