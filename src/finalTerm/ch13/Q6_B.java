package finalTerm.ch13;

import java.util.Arrays;

public class Q6_B {                     // O(NlogN)
    public static void main(String[] args)  {
        int n[] = {2,3,4,6,7,2,2,1};

        Arrays.sort(n);
        int maxCount = 0, maxValue = n[0], count = 1;

        for(int i = 1; i < n.length; i++)   {
            if(n[i - 1] != n[i])    {   //n[i - 1]값의 연속의 마지막인 지점
                if(count > maxCount)    {
                    maxCount = count;
                    maxValue = n[i - 1];    // n-1 이 최댓값인거 기억!
                }
                count = 0;
            }
            count++;
        }
        if(count > maxCount)    {
            maxCount = count;
            maxValue = n[n.length - 1];
        }

    }
}
