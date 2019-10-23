package ch1;

import java.util.Random;

public class Q20 {
    public static void main(String[] args)  {

//        Random random = new Random();
//        int[] num = new int[100];
//        double avg = 0.0;
//        for(int i = 0; i < num.length - 1; i++) {
//            num[i] = random.nextInt(100);
//            avg += num[i];
//        }
//        String average = String.format("%.2f", avg / num.length);
//
//        System.out.println(average);
        final int N = 10;
        int[] arr = new int[N];
        Random random = new Random();
        double sum = 0.0;
        String avg = "";

        for(int i = 0; i < arr.length; i++)	{
            sum += arr[i] = random.nextInt(100);
        }

        System.out.println(sum);

        avg = String.format("%.2f", sum / arr.length);

        System.out.println(avg);

    }
}
