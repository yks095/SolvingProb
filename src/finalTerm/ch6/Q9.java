package finalTerm.ch6;

public class Q9 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, 0, n.length-1));
    }

    private static int max(int[] n, int low, int high) {

        if(low == high) {       // if문 잘 보기
            return n[low];
        }

        int m = (low + high) / 2;

        int left = max(n, low, m);                  // left, right에서 m값 잘 설정 하기
        int right = max(n, m + 1, high);

        return left < right ? right : left;

    }
}
