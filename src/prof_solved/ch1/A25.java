package prof_solved.ch1;

import java.util.Arrays;

public class A25 {
    public static void main(String[] args) {
        int	n[]= {5,3,1,4,2};
        //int	n[]= {5,3,1,4,2,6};
        Arrays.sort(n);
        if(n.length%2==1) System.out.println(n[n.length/2]);
        else System.out.println((n[n.length/2-1]+n[n.length/2])/2.);
    }
}
