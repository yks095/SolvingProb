package ch_1;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
