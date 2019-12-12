package prof_solved.final_solved.ch13;

public class Q6_A {
    public static void main(String[] args)  {
        int n[] = {1,2,2,3,4,5,6,6,7,7,3,2};

        int maxCount = 0, maxValue = n[0];
        for(int i = 0; i < n.length; i++) {
            int count = 0;
            for (int j = 0; j < n.length; j++)
                if (n[i] == n[j])
                    count++;
            if (count > maxCount) {
                maxCount = count;
                maxValue = n[i];
            }
        }
    }
}
