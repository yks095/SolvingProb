package ch1;

import java.util.Arrays;
import java.util.Random;

public class Q22 {
    public static void main(String[] args)  {

        int max = 0;
        int secondMax = 0;

        Random random = new Random();

        int[] N = new int[9];

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
            if(N[i] > max)
                max = N[i];
        }

        for(int i = 0; i < N.length; i++)   {
            if(N[i] != max && N[i] > secondMax)
                secondMax = N[i];
        }

        System.out.println(Arrays.toString(N));
        System.out.println(secondMax);



    }
}
