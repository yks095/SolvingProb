package midTerm;

public class ch3_Q8 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);
        int searchValue=2; // 1,2,9 등으로 변경하면서 실행해 볼 것.
        Node p=head, prev=null;
        while(p!=null && p.data!=searchValue){ prev=p; p=p.next; }
        if(p==null) System.out.println(searchValue+" does not exist");
        else{
            if(prev!=null) prev.next=p.next;
            else head=p.next;
            p.next=null;
        }
        printList(head);
    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
        System.out.println();
    }
}
