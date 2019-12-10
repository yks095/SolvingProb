package prof_solved.mid_solved.ch1;

public class A24 {
    public static void main(String[] args) {
        int	n[]= {1,1,2,2,3,3};
        //int	n[]= {1,1,1,1,1,1};
        //int	n[]= {Integer.MIN_VALUE,Integer.MIN_VALUE};
        //int	n[]= {Integer.MIN_VALUE, Integer.MIN_VALUE, 1,1,1,1};
        int	max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        boolean	flag=false;
        for (int i = 0; i < n.length; i++) if(n[i]>=max) max=n[i];
        for (int i = 0; i < n.length; i++) {
            if(n[i]==max) continue;
            if(n[i]>=second) { flag=true; second=n[i]; }
        }
        if(flag) System.out.println(second);
        else System.out.println("none");
    }
}
