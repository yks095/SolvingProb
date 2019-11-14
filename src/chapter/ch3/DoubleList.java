package chapter.ch3;

public class DoubleList {
    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data)  {
        Node newNode = new Node(data);
        if(head != null)    {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        if(head.next == null)
            tail = head;
        size++;
    }

    public void removeFirst()   {
        Node p = head;
        if(head == null)   {
            System.out.println("Data doesn't exist!");
            System.exit(0);
        }
        else if(head.next == null)   {
            head = tail = null;
        }
        else if(head != null)    {
            head = p.next;
            p.next = p.prev = null;
            head.prev = null;
        }

    }

    public void addLast(int i) {
        Node newNode = new Node(i);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
            size++;
        }
    }

    public void removeLast() {
        Node p = head;
        Node p_prev = null;
        if(head == null && tail == null)    {
            System.out.println("Data don't exist!!");
            System.exit(0);
        }
        else if(head.next == null && tail.prev == null)  {
            head = tail = null;
        }
        else if(head != null) {
            while(p.next != null)   {
                p_prev = p;
                p = p.next;
            }
            p_prev.next = null;
            tail = p_prev;
        }
    }

    @Override
    public String toString() {
        String v = "head";
        String v2 = "tail";

        for(Node p = head; p != null; p = p.next)   {
            if(v.length() > 0)
                v += " -> ";
            v += p.data;
        }


        for(Node p = tail; p != null; p = p.prev)   {
            if(v2.length() > 0)
                v2 += " -> ";
            v2 += p.data;
        }

        return v + "\n" + v2;
    }



}
