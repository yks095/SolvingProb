package ch2;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        char s[]= {'화', '수', '목', '금', '토', '일'};
        System.out.println(Arrays.toString(s)); // 삽입 전

        char t[] = new char[s.length + 1];

        for(int i = 1; i < t.length; i++)   {   // System.arraycopy(s, 0, t, 1, s.length);
            t[i] = s[i - 1];
        }
        t[0] = '월';
        s = t;

        System.out.println(Arrays.toString(s)); // 삽입 후
    }
}
