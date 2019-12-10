package prof_solved.mid_solved.ch1;

import java.util.Arrays;
import java.util.Random;

public class A15 {
    public static void main(String[] args) {
        Random	random=new Random();
        int	c[]=new int[6];
        for (int i = 0; i < 6000; i++) c[random.nextInt(6)]++;
        System.out.println(Arrays.toString(c));
    }
}
