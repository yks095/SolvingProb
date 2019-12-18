package finalTerm.ch13;

import java.util.Random;

public class Q6_A {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 10000;
        int n[] = new int[N];

        for (int i = 0; i < n.length; i++)
            n[i] = random.nextInt(N / 2);

        int count = 0, maxCount = 0, maxValue = n[0];

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; i < n.length; j++) {
                if (n[i] == n[j]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        maxValue = n[i];
                    }
                }
            }
        }
    }
}
