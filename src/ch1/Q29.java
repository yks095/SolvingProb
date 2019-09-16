package ch1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args)  {

        int[] N = new int[5];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("회전 시킬 횟수 : ");
        int K = sc.nextInt();

        for(int i = 0; i < N.length; i++)   {
            N[i] = random.nextInt(10);
        }

        System.out.println("회전 전 : " + Arrays.toString(N));
        System.out.println(K + "회 회전 중...");

        while(K-- != 0) {
            int temp = 0;
            for (int i = N.length - 1; i >= 0; i--) {
                if (i == N.length - 1) {
                    temp = N[N.length - 1];
                    N[i] = N[i - 1];
                }
                else if (i == 0) {
                    N[i] = temp;
                    break;
                }
                N[i] = N[i - 1];
            }
        }

        System.out.println("회전 후 : " + Arrays.toString(N));

    }
}
