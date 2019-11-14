package chapter.ch6;

public class Q9 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, 0, n.length-1));
    }
    private static long max(int[] n, int low, int high) {
        if(low == high)
            return n[low];

        int mid = (low + high) % 2 == 0 ?
                ((low + high) / 2) - 1 : (low + high) / 2;

        long left = max(n, low, mid);
        long right = max(n, mid + 1, high);

        return left >= right ? left : right;
    }
}