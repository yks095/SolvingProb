package midTerm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];

        for(int i = 0; i < arr.length; i++)	{
            arr[i] = random.nextInt(10);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++)	{
            for(int j = 0; j < i; j++)	{
                if(arr[i] == arr[j])
                    arr[j] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}