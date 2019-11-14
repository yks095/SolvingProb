package chapter.ch1;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        int n[] = {5, 9, 1, 3, 5, 8, 2, 4, 9};
        Arrays.sort(n);
        int mid;

        if(n.length % 2 == 0)   {
            mid = (n.length / 2) - 1;
            for (int i = 0; i <= mid; i++) {
                int temp = n[n.length - 1 - i];
                n[n.length - 1 - i] = n[i];
                n[i] = temp;
            }
        }
        else {
            mid = n.length / 2;
            for (int i = 0; i < mid; i++) {
                int temp = n[n.length - 1 - i];
                n[n.length - 1 - i] = n[i];
                n[i] = temp;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
