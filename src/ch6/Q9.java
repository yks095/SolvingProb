package ch6;

public class Q9 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(sum(n, 0, n.length-1));
    }
    private static long sum(int[] n, int low, int high) {
        if(low == high)
            return n[low];

        int mid = (low + high) % 2 == 0 ?
                ((low + high) / 2) - 1 : (low + high) / 2;

        return sum(n, low, mid) >= sum(n, mid + 1, high) ?
                sum(n, low, mid) : sum(n, mid + 1, high);
    }
}