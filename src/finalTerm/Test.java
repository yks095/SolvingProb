package finalTerm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        int N=10000;
        int n[]=new int[N];

        for (int i = 0; i < n.length; i++)
            n[i]=random.nextInt(N/2);

        int count = 0, maxCount = 0, maxValue = n[0];

        for(int i = 0; i < n.length; i++)	{
            count = 0;
            for(int j = i + 1; j < n.length; j++)	{
                if(n[i] == n[j])
                    count++;
            }
            if(count > maxCount)	{
                maxCount = count;
                maxValue = n[i];
            }
        }

        System.out.println(maxValue + ", " + maxCount);


    }
}
