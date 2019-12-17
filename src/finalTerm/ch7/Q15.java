package finalTerm.ch7;

import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int v[]={10005,10002,10002,10001,10003};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int     min=v[0], max=v[0];

        for (int i = 1; i < v.length; i++){
            if(v[i]>max) max=v[i];
            if(v[i]<min) min=v[i];
        }

        int     count[]=new int[max-min+1];

        for (int i = 0; i < v.length; i++)      // 조건문에서 cnt.length가 아닌 v.length
            count[v[i]-min]++;

        for (int i = 0, k=0; i < count.length; i++) {
            while(count[i]-->0)
                v[k++]=i+min;
        }
    }
}
