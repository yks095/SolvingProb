package ch8;

import java.util.Arrays;
import java.util.Random;

public class Q1_B {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {

        Arrays.sort(v);

        int left = 0, right = v.length-1;

        while(left <= right){
            int m = (left + right) / 2;

            if(key == v[m])
                return m;

            if(key < v[m])
                right = m - 1;

            else left = m + 1;
        }

        return -1;


    }
}
