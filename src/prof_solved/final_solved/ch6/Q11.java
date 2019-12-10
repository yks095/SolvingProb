package prof_solved.final_solved.ch6;

public class Q11 {
    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
        if(i == v.length) return 0;

        int count = 0;
        if(v[i] >= 'A' && v[i] <= 'Z') count = 1;

        return count + countUpper(v, i + 1);
        // return (v[i] >= 'A' && v[i] <= 'Z') ? 1 : 0 으로 바꾸어도 됨

    }
}
