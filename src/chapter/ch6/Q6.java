package chapter.ch6;

public class Q6 {
    public static void main(String[] args) {
        int n[]={7,2,8,4,1};
        System.out.println(sum(n, n.length-1));
    }
    private static int sum(int[] n, int i) {
        if(i == 0)
            return n[0];

        int sum = sum(n, i - 1);

        return n[i] + sum;
    }
}
