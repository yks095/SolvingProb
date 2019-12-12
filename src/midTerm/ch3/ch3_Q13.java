package midTerm.ch3;

public class ch3_Q13 {
    Node head, tail;
    public void addLast(int data) {
        if(tail==null)
            head=tail=new Node(data);
        else {
            tail.next=new Node(data);
            tail=tail.next;
        }
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
