package finalTerm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++)
            v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }

    private static int search(int[] v, int key) {
        int i = 0;
        int lastVal = v[v.length - 1];
        v[v.length - 1] = key;

        while(v[i] != key)
            i++;

        if(i < v.length - 1)
            return i;

        if(lastVal == key)
            return v.length - 1;

        return -1;

    }
}
