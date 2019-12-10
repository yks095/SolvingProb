package prof_solved.final_solved.ch6;

public class Q10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {

        if(v[i] >= 'a' && v[i] <= 'z') v[i] += 'A' - 'a';
        // ...
    }
}
