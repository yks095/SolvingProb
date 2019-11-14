package chapter.ch1;

import java.util.Arrays;
import java.util.Random;

public class Q15 {
    public static void main(String[] args)  {

        Random random = new Random();
        int dice;
        int[] countArr = new int[6];

        for(int i = 0; i < 6000; i++)   {
            dice = random.nextInt(6) + 1;
            countArr[dice - 1]++;
        }

        System.out.println(Arrays.toString(countArr));

    }
}
