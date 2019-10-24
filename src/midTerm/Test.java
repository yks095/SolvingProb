package midTerm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test	{
    public static void main(String[] args) {
        int[] v = {4,1,1,1,4};
        int[] c = new int[101];

//        Random random = new Random();
//
//        for(int i = 0; i < v.length; i++) {
//            v[i] = random.nextInt(101);
//        }

        // Arrays.sort(v);

        for(int i = 0; i < v.length; i++) {
            c[v[i]]++;
        }

        System.out.println(Arrays.toString(c));

        for(int i = 0; i < c.length; i++)   {
            if(c[i] != 0)
                System.out.println(i);
        }
    }
}