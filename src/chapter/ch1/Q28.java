package chapter.ch1;

import java.util.Arrays;
import java.util.Random;

public class Q28 {
    public static void main(String[] args)  {

        int[] N = new int[5];
        Random random = new Random();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
        }

        System.out.println("회전 전 : " + Arrays.toString(N));

        int temp = 0;
        for(int i = N.length - 1; i >= 0; i--)   {
            if(i == N.length - 1) {
                temp = N[N.length - 1];
            }
            if(i == 0) {
                N[i] = temp;
                break;
            }
            N[i] = N[i - 1];
        }
        System.out.println("회전 후 : " + Arrays.toString(N));
    }
}
