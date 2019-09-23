package ch3;

public class Q7 {
    public static void main(String[] args) {

        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printList(head);

        if (head != null) {
            Node p = head, prev = null;
            while (p.next != null)  {
                prev = p;
                p = p.next;
            }
            if(prev != null)
                prev.next = null;
            else
                head = null;
        }
    }
    private static void printList(Node head) {
        for (Node p = head; p != null; p = p.next) {
            if(p.next == null)
                System.out.print(p.data);
            else
                System.out.print(p.data+"->");
        }
        System.out.println();
    }
}
