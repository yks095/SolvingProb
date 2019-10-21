package midTerm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        SimpleListTest list=new SimpleListTest();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(9);
        list.addLast(8);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}