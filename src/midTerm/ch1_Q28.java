package midTerm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ch1_Q28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)	{
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        System.out.print("회전 횟수 : ");
        int rotate = sc.nextInt();

        while(rotate-- != 0)	{

            int lastNum = 0;

            for(int i = arr.length - 1; i >= 0; i--)	{
                if(i == arr.length - 1)	{
                    lastNum = arr[i];
                    continue;
                }
                else{
                    arr[i + 1] = arr[i];
                    if(i == 0)
                        arr[i] = lastNum;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}