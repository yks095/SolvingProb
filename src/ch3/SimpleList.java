package ch3;

public class SimpleList {
    Node head;
    public void addFirst(int data)  {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

// Generic
//public class SimpleList<T> {
//    Node<T> head;
//
//    public void addFirst(T data) {
//        Node<T> newNode = new Node<>(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    @Override
//    public String toString() {
//        String v = "";
//        for (Node<T> p = head; p != null; p = p.next) {
//            if (v.length() > 0)
//                v += "->";
//            v += p.data;
//        }
//        return v;
//    }
//}