package quiz;

import java.util.Arrays;

public class Q2_1 {
    public static void main(String[] args)  {

        long v[] = {34, 76, 11, 3, 7, 13, 9};
        long sub[] = new long[v.length - 1];

        Arrays.sort(v);

        for(int i = 1; i < v.length; i++)  {
            sub[i - 1] = v[i] - v[i - 1];
        }

        System.out.println(Arrays.toString(sub));
    }
}
