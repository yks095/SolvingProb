package midTerm;

public class SimpleListTest {
    Node head, tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null)
            head = tail = newNode;
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(tail == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public void removeFirst()	{
        if(head == null)
            throw new RuntimeException("list is empty");
        else if(head.next == null)
            head = tail = null;
        else{
            Node p = head;
            head = head.next;
            p.next = head.prev = null;
        }
    }

    public void removeLast() {
        if(tail == null)
            throw new RuntimeException("list is empty");
        else if(tail.prev == null)
            head = tail = null;
        else{
            Node p = tail;
            tail = tail.prev;
            tail.next = p.prev = null;
        }
    }




    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("head");
        for(Node p = head; p != null; p = p.next){
            sb.append("->").append(p.data);
        }

        sb.append("\n").append("tail");
        for(Node p = tail; p != null; p = p.prev){
            sb.append("->").append(p.data);
        }

        return sb.toString();
    }
}
