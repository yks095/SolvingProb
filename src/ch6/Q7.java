package ch6;

// 점화식
// i = n.length - 1 : sum(n, i) = n[i]
// i > 0 : sum(n, i) = n[i] + sum(n, i + 1)

public class Q7 {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        System.out.println(sum(n, 0));
    }
    private static int sum(int[] n, int i) {
        if(i == n.length - 1)
            return n[i];

        return n[i] + sum(n, i + 1);
    }
}
