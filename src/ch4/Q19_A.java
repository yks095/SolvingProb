package ch4;

import java.util.Arrays;

public class Q19_A {
    public static void main(String[] args) {
        int price[] = {100, 90, 80, 70, 85, 95, 110, 120};
        int span[] = new int[price.length];

        for(int i = 0; i < price.length; i++)   {
            for(int j = i; j >= 0; j--) {
                if(price[i] >= price[j])
                    span[i]++;
            }
        }
        System.out.println(Arrays.toString(span));

    }
}
