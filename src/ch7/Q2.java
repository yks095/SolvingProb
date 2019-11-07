package ch7;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int v[] = new int[]{5, 8, 1, 9, 3, 5, 1, 5};
        selectionSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < v.length; j++) {
                if(v[minPos] > v[j])
                    minPos = j;
            }

            int x = v[i];
            v[i]=v[minPos];
            v[minPos]=x;
        }
    }
}
