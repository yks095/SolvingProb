package chapter.ch3;

public class Q16 {
    public static void main(String[] args) {
        DoubleList list = new DoubleList();

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

