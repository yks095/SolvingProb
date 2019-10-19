package midTerm;

public class SimpleListTest {
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
        Node p = head;

        while(i-- != 0)
            p = p.next;

        return p.data;
    }

    Node tail;

    public void addLast(int i)	{
        Node newNode = new Node(i);
        if(tail == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void removeLast()	{
        Node prev = null;
        if(head != null)	{
            Node p = head;

            while(p.next != null)	{
                prev = p;
                p = p.next;
            }
            prev.next = null;
        }
        else
            head = null;
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
