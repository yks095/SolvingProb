package midTerm;

public class ch3_Q12 {
    Node head;
    int size = 0;

    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void removeFirst()	{
        if(head != null) 	{
            Node p = head;
            head = head.next;
            p.next = null;
        }
        else
            head = null;
    }

    public int size() {
        return size;
    }
    public int get(int i) {
        if(i < 0 || i >= size)
            throw new RuntimeException("invalid index");

        Node p = head;

        while(i-- != 0)
            p = p.next;

        return p.data;
    }

    @Override
    public String toString() {
        String v = "";
        for(Node p = head; p != null; p = p.next)   {
            if(v.length() > 0)
                v += " -> ";
            v += p.data;
        }

        return v;
    }
}

