package chapter.ch1;

import java.util.Arrays;
import java.util.Random;

public class Q26 {
    public static void main(String[] args)  {

        int[] N = new int[10];
        int[] count = new int[N.length];
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
            count[N[i]]++;
        }

        System.out.println(Arrays.toString(N));

        for(int i = 0; i < count.length; i++)   {
            if(count[i] != 0)
                System.out.print(i + " ");
        }
    }
}
