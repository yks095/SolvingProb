package test;

import java.util.Arrays;

public class ch1_Test1 {
    public static void main(String[] args)  {
        int n[] = {32,54,65,21,10};

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));


        int max = n[0];
        for(int i = 0; i < n.length; i++)   {
            if(n[i] > max) max = n[i];
        }
        System.out.println(max);
    }
}
