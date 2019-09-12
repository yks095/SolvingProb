package ch1;

import java.util.Arrays;
import java.util.Random;

public class Q27 {
    public static void main(String[] args)  {

        int[] N = new int[9];
        int[] score = new int[9];
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
        }

        Arrays.sort(N);

        for(int i = 0; i < N.length/2; i++) {
            int temp = N[i];
            N[i] = N[N.length - 1- i];
            N[N.length - 1- i] = temp;
        }

        score[0] = 1;

        for(int i = 1; i < N.length; i++)   {
            if(N[i] < N[i - 1])
                score[i] = score[i - 1] + 1;
            else if(N[i] == N[i - 1]) {
                score[i] = score[i - 1];
                continue;
            }
        }

        System.out.println("배열 : " + Arrays.toString(N));
        System.out.println("순위 : " + Arrays.toString(score));

    }
}
