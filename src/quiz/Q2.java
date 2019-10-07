package quiz;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args)  {

        long v[] = {34, 76, 11, 3, 7, 13, 9};

        Arrays.sort(v);

        long distance;
        long min = 0;
        for(int i = 1; i < v.length; i++)   {
            distance = v[i] - v[i - 1];
            if(i == 1)
                min = distance;
            else if(distance <= min)    {
                min = distance;
            }
        }

        System.out.println(min);
    }
}
