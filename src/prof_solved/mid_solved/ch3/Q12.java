package prof_solved.mid_solved.ch3;

import chapter.ch3.SimpleList;

public class Q12 {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        for (int i = 0; i < 5; i++)
            list.addFirst(i);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
