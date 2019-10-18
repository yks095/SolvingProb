package prof_solved.ch1;

import java.util.Arrays;

public class A28_B {
    public static void main(String[] args) {
        int	v[]= {1,2,3,4,5};
        int	k=2;
        k=k%v.length;
        for (int i = 0; i < k; i++) rotate(v);
        System.out.println(Arrays.toString(v));
    }
    private static void rotate(int[] v) {
        int	temp=v[v.length-1];
        for (int i = v.length-2; i>=0; i--) v[i+1]=v[i];
        v[0]=temp;
    }
}
