package prof_solved.ch1;

public class A26_B {
    public static void main(String[] args) {
        int	n[]= {4,5,1,6,1,3,4,5,1}; // 값 범위 제한: 0~9
        int	c[]=new int[10];
        for (int i = 0; i < n.length; i++) c[n[i]]++;
        for (int i = 0; i < c.length; i++) {
            if(c[i]>0) System.out.print(i+" ");
        }
    }
}
