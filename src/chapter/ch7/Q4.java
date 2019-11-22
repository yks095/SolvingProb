package chapter.ch7;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int n[]={1,3,5,7,8};
        int m[]={2,4,6,7,10};
        int v[]=mergeArray(n, m);
        System.out.println(Arrays.toString(v));
    }
    private static int[] mergeArray(int[] n, int[] m) {

        int[] v = new int[n.length + m.length];
        int i = 0, j = 0, k = 0;

        while(i < n.length && j < m.length)   {
            v[k++] = (n[i] < m[j]) ? n[i++] : m[j++];
//            if(n[i] > m[j])
//                v[k++] = m[j++];
//            else
//                v[k++] = n[i++];
        }

        while(i < n.length)
            v[k++] = n[i++];
        while(j < m.length)
            v[k++] = m[j++];

        return v;
    }
}
