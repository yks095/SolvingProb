package chapter.ch7;

import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int v[]={10005,10002,10002,10001,10003};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i < v.length; i++)   {
            if(v[i] <= min)
                min = v[i];
            if(v[i] >= max)
                max = v[i];
        }

        int[] cnt = new int[max - min + 1];

        for(int i = 0; i < v.length; i++)   {
            cnt[v[i] - min]++;
        }

        for(int i = 0, k = 0; i < cnt.length; i++) {
            while(cnt[i]-- > 0)
                v[k++] = i + min;
        }
    }
}
