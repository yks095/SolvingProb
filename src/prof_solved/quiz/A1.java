package prof_solved.quiz;

public class A1 {
    public static void main(String[] args) {
        long	n[]={34,76,11,3,7,13,9};
        long	min_dist=Math.abs(n[0]-n[1]);
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                long	dist=Math.abs(n[i]-n[j]);
                if(dist<=min_dist) min_dist=dist;
            }
        }
        System.out.println(min_dist);
    }
}
