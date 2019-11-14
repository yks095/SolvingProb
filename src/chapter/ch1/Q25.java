package chapter.ch1;

import java.util.Arrays;
import java.util.Random;

public class Q25 {
    public static void main(String[] args)  {

        Random random = new Random();
        int[] arr = new int[10];
        double mid = 0.0;

        for(int i = 0; i < arr.length; i++)	{
            arr[i] = random.nextInt(10);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        if(arr.length % 2 == 0)	{
            mid = (double)((arr[arr.length / 2] - 1) + arr[arr.length / 2]) / 2;
        }
        else{
            mid = arr[arr.length / 2];
        }

        System.out.println(mid);
    }
}
