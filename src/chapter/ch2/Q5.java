package chapter.ch2;

import java.util.LinkedList;
import java.util.Random;

public class Q5 {
    public static void main(String[] args)  {

        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for(int i = 0; i < 1000000; i++)    {
            list.add(random.nextInt(101));
        }

        System.out.println(list.get(99999));
    }
}
