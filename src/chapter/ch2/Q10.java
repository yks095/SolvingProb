package chapter.ch2;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int n[] = {3, 4, 5, 6, 7, 0, 0, 0, 0, 0};

        for(int i = 1; i <= 4; i++) {
            if(i == 4) {
                n[i - 1] = n[i];
                n[i] = 0;
            }
            else
                n[i - 1] = n[i];
        }

        System.out.println(Arrays.toString(n));
    }
}
