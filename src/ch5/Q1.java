package ch5;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.addLast("한국"); // 큐 rear에 자료 삽입, queue.add("한국");
        queue.addLast("미국"); // 큐 rear에 자료 삽입
        queue.addLast("독일"); // 큐 rear에 자료 삽입

        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 크기="+queue.size());
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());

        String v=null;
        v=queue.getFirst();
        System.out.println("큐 front 자료 확인="+v);

        v=queue.removeFirst(); // String v=queue.remove();
        System.out.println("큐 front 추출 값="+v);

        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeFirst());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeFirst());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());
    }
}
