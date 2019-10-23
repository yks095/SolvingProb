package midTerm;

public class Test	{
    public static void main(String[] args) {
//        SimpleListTest list=new SimpleListTest();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addLast(9);
//        list.addLast(8);
//        System.out.println(list);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list);
        SimpleList simpleList = new SimpleList();
        simpleList.addLast(1);
        simpleList.addLast(2);
        simpleList.addLast(3);
        System.out.println(simpleList);
        simpleList.reverse();
        System.out.println(simpleList);

    }
}