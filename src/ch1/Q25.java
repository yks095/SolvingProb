package ch1;

import java.util.Arrays;
import java.util.Random;

public class Q25 {
    public static void main(String[] args)  {

        int[] N = new int[8];
//        int[] N = new int[9];
        int median;
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
        }

        Arrays.sort(N);
        median = N.length / 2;

        if(N.length % 2 == 0)
            System.out.println((double)(N[median] + N[median - 1]) / 2);
        else
            System.out.println(N[median]);
    }
}
