package quiz;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args)  {

        long v[] = {34, 76, 11, 3, 7, 13, 9};

        Arrays.sort(v);

        long distance;
        long min = Math.abs(v[0] - v[1]);
        for(int i = 1; i < v.length; i++)   {
            distance = Math.abs(v[i - 1] - v[i]);
            if(distance <= min)    {
                min = distance;
            }
        }

        System.out.println(min);
    }
}
