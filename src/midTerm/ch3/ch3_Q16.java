package midTerm.ch3;

public class ch3_Q16 {
    public static void main(String[] args) {
        SimpleListTest list = new SimpleListTest();
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
