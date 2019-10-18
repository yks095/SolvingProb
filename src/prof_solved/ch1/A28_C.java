package prof_solved.ch1;

import java.util.Arrays;

public class A28_C {
    public static void main(String[] args) {
        int	v[]= {1,2,3,4,5};
        int	k=2;
        k=k%v.length;
        reverse(v,0,v.length-1);
        reverse(v,0,k-1);
        reverse(v,k,v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void reverse(int[] v, int s, int e) {
        while(s<e) {
            int	temp=v[s];
            v[s]=v[e];
            v[e]=temp;
            s++;
            e--;
        }
    }
}
