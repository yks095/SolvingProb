package prof_solved.ch3;

public class A12_SimpleList {
    Node head;
    int	size;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int size() {
        return size;
    }
    public int get(int i) {
        if(i<0 || i>=size) throw new RuntimeException("invalid index");
        Node	p=head;
        while(i-->0) p=p.next;
        return p.data;
    }
    @Override
    public String toString() {
        String v="";
        for (Node p=head; p!=null; p=p.next){
            if(v.length()>0) v+="->";
            v+=p.data;
        }
        return v;
    }
}
