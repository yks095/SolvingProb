package ch7;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int v[] = new int[]{5, 8, 1, 9, 3, 5, 1, 5};
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            for (int j = i; j > 0 && v[j - 1] > v[j]; j--) {
                int x = v[j];
                v[j] = v[j - 1];
                v[j - 1] = x;
            }
        }
    }
}
