package ch3;

public class Q15 {
    public static void main(String[] args)  {

        Node n1 = new Node(1);
        Node n2 = new Node(2);

        Node head = n1;
        Node tail = n2;

        n1.next = n2;
        n2.prev = n1;

        System.out.print("head");

        for (Node p = head; p != null; p = p.next)
            System.out.print("->" + p.data);

        System.out.print("\ntail");

        for (Node p = tail; p != null; p = p.prev)
            System.out.print("->" + p.data);
    }
}