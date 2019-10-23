package midTerm;

public class SimpleList {
    Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast ( int data){
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node p = head;
            while (p.next != null)
                p = p.next;
            p.next = newNode;
        }
    }

    public void removeFirst () {
        if (head == null)
            throw new RuntimeException("list is empty!");
        else {
            Node p = head;
            head = head.next;
            p.next = null;
        }
    }

    public void removeLast() {
        if (head == null)
            throw new RuntimeException("list is empty!");
        else if (head.next == null)
            head = null;
        else {
            Node p = head;
            Node prev = null;
            while (p.next != null) {
                prev = p;
                p = p.next;
            }
            prev.next = null;
        }
    }

    public void reverse() {
//        Node p = null;
//        while(head.next != null)    {
//            p = head;
//            head = head.next;
//            head.prev = p;
//            p.next = null;
//        }
        Node prev = null;
        Node next = null;
        Node p = head;

        while (p != null) {
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }

        head = prev;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("head");
        for(Node p = head; p != null; p = p.next){
            sb.append("->").append(p.data);
        }

//        StringBuilder sb2 = new StringBuilder("head");
//        for(Node p = head; p != null; p = p.prev){
//            sb2.append("->").append(p.data);
//        }

        return sb.toString();
    }
}

