package chapter.ch1;

import java.util.Arrays;
import java.util.Random;

public class Q23 {
    public static void main(String[] args)  {

        int max = 0;
        int maxIdx = 0;
        int secondMax = 0;

        int[] N = new int[9];
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
            if(N[i] > max) {
                max = N[i];
                maxIdx = i;
            }
        }
        
        for(int i = 0; i < N.length; i++)   {
            if(secondMax < N[i] && i != maxIdx)
                secondMax = N[i];

        }

        System.out.println(Arrays.toString(N));
        System.out.println(secondMax);


    }
}
