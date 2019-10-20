package midTerm;

public class SimpleListTest {
    Node head, tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null)
            head = tail = newNode;
        else  {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null)
            head = tail = newNode;
        else  {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        Node p = head;

        if(head == null)
            throw new RuntimeException("list is empty!");

        else if(head.next == null)
            head = tail = null;

        else if(head != null)  {
            head = head.next;
            p.next = head.prev = null;
        }

    }

    public void removeLast() {
        Node p = tail;

        if(head == null)
            throw new RuntimeException("list is empty!");

        else if(head.next == null)
            head = tail = null;

        else if(head != null)  {
            tail = tail.prev;
            p.prev = tail.next = null;


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
