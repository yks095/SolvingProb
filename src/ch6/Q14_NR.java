package ch6;

public class Q14_NR {
    public static void main(String[] args) {
        System.out.println(gcd(64,48));
    }
    private static int gcd(int a, int b) {

        while(b > 0)   {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
