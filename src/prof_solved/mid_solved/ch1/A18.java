package prof_solved.mid_solved.ch1;

import java.util.Arrays;

public class A18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for (int i=0; i<n.length/2; i++) {
            int	temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(n));
    }
}
