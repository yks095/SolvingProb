package ch6;

public class Q10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        for(int j = 0; j < v.length; j++)    {
            if(v[j] >= 'a' && v[j] <= 'z') {
                v[j] = (char)(v[j] - 32);
            }
        }
    }
}
