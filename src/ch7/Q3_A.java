package ch7;

import java.util.Arrays;

public class Q3_A {
    public static void main(String[] args) {
        int v[] = new int[]{5, 8, 1, 9, 3, 5, 1, 5};
        insertionSort(v);
        System.out.println("result : " + Arrays.toString(v));
    }

    private static void insertionSort(int[] v) {

        for (int i = 1; i < v.length; i++) {
            int temp = v[i];
            int j = 0;
            for (j = i; j > 0 && v[j - 1] > temp; j--) {
                v[j] = v[j - 1];
            }
            v[j] = temp;
            System.out.println("i = " + i + ", 배열 내용 = " + Arrays.toString(v));
        }
    }
}
