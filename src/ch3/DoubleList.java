package ch3;

public class DoubleList {
    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data)  {
        Node newNode = new Node(data);
        if(head != null)    {
            newNode.next = head;

        }
        head = newNode;
    }

    public void removeFirst()   {
        if(head != null)    {
            Node p = head;
            head = head.next;
            p.next = null;
        }
    }

    public int size() { // 연결리스트의 저장된 자료의 전에 갯수
        return size;
    }

    public String get(int i) { // i번째 노드의 data값
        Node p = head;
        while (i-- > 0) {
            p = p.next;
        }
        return String.valueOf(p.data);
    }

    // tail 필드 추가하고, tail 사용하여 구현
    public void addLast(int i) {
        Node newNode = new Node(i);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
            size++;
        }
    }

    public void removeLast() {
        Node p = head;
        Node prev = null;

        if(p == null)    {
            p.next = null;
        }
        else {
            while(p.next != null)   {
                prev = p;
                p = p.next;
            }
            prev.next = p.next;
            p.next = null;
        }
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
