package chapter.ch9;

import java.util.TreeMap;

public class Q4 {
    public static void main(String[] args)  {
        TreeMap<Integer, Player_Q4> treeMap = new TreeMap<>();
        for(int i = 1; i <= 1000000; i++)   {
            treeMap.put(i, new Player_Q4(i));
        }

        for(int i = 1; i <= 1000000; i++)   {
            if(i % 2 ==1)
                treeMap.remove(i);
        }
    }
}
