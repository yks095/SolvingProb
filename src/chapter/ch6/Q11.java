package chapter.ch6;

public class Q11 {

    static int cnt = 0;

    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {

        if(i == v.length)
            return cnt;

        if(v[i] >= 'A' && v[i] <= 'Z')  {
            cnt++;
        }

        return countUpper(v, i + 1);

    }
}
