package ch1;

import java.util.Random;

public class Q14 {
    public static void main(String[] args)  {

        Random random = new Random();
        int dice;

        for(int i = 0; i < 20; i++) {
            dice = random.nextInt(6) + 1;
            System.out.print(dice + " ");
        }

    }
}
