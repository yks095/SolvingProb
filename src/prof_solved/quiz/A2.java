package prof_solved.quiz;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        long	n[]={34,76,11,3,7,13,9};
        Arrays.sort(n);
        long	min_dist=Math.abs(n[0]-n[1]);
        for (int i = 1; i < n.length; i++) {
            long	dist=Math.abs(n[i-1]-n[i]);
            if(dist<=min_dist) min_dist=dist;
        }
        System.out.println(min_dist);
    }
}
