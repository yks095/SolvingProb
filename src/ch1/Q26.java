package ch1;

import java.util.Arrays;
import java.util.Random;

public class Q26 {
    public static void main(String[] args)  {

        int[] N = new int[10];
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
        }

        Arrays.sort(N);

        System.out.println(Arrays.toString(N));

        for(int i = 0; i < N.length - 1; i++) {
            if (N[i] == N[i + 1]) {
                N[i] = -1;
            }
        }

        for(int i = 0; i < N.length; i++)   {
            if(N[i] != -1)
                System.out.print(N[i] + " ");
        }
    }
}
