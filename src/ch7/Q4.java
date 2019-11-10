package ch7;

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

        while(i != n.length - 1 && j != m.length - 1)   {
            if(n[i] > m[j]) {
                v[k++] = m[j++];
                continue;
            }
            else if(n[i] < m[j])    {
                v[k++] = n[i++];
                continue;
            }

            System.out.println(Arrays.toString(v));

        }

        if(i != n.length - 1)   {
            while(i != n.length - 1)
                v[k++] = n[i++];
        }
        else if(j != m.length - 1)  {
            while(j != m.length - 1)
                v[k++] = n[j++];
        }


        return v;
    }
}
