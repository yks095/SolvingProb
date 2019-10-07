package quiz;

import java.util.Arrays;

public class Q1_1 {
    public static void main(String[] args)  {

        long v[] = {34, 76, 11, 3, 7, 13, 9};
        long sub[] = new long[v.length - 1];

        long min = 0;
        long distance;

        for(int i = 0; i < v.length; i++)  {
            for(int j = i + 1; j < v.length; j++)   {
                distance = Math.abs(v[j] - v[i]);
                if(i == 0)
                    min = distance;

                if(distance <= min) {
                    min = distance;
                    System.out.println(min);
                }

                if(j == v.length - 1)
                    sub[i] = min;
            }

        }

        System.out.println(Arrays.toString(sub));
        System.out.println(min);
    }
}
