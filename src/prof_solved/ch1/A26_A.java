package prof_solved.ch1;

import java.util.Arrays;

public class A26_A {
    public static void main(String[] args) {
        int	n[]= {4,5,1,6,1,3,4,5,1};
        Arrays.sort(n);
        System.out.print(n[0]+" ");
        for (int i = 1; i < n.length; i++) {
            if(n[i-1]!=n[i]) System.out.print(n[i]+" ");
        }
    }
}
