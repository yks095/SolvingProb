package ch6;

public class Q11 {
    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
        int cnt = 0;

        for(int j = 0; j < v.length; j++)    {
            if(v[j] >= 'A' && v[j] <= 'Z')
                cnt++;
        }

        return cnt;

    }
}
